package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IFichajeService;
import com.edu.back.mcs.PracticaFinal.mappers.FichajeMapper;
import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.DTO.FichajeDTO;
import com.edu.back.mcs.PracticaFinal.model.ValueObjects.Temporada;
import com.edu.back.mcs.PracticaFinal.repository.EquipoRepository;
import com.edu.back.mcs.PracticaFinal.repository.FichajesRepository;
import com.edu.back.mcs.PracticaFinal.repository.JugadorRepository;

@Service
public class FichajeServiceimpl implements IFichajeService {

    public final FichajesRepository fichajesRepository;
    public final FichajeMapper fichajeMapper;
    public final JugadorRepository jugadorRepository;
    public final EquipoRepository equipoRepository;

    public FichajeServiceimpl(FichajesRepository fichajesRepository, FichajeMapper fichajeMapper,
            JugadorRepository jugadorRepository, EquipoRepository equipoRepository) {
        this.fichajesRepository = fichajesRepository;
        this.fichajeMapper = fichajeMapper;
        this.jugadorRepository = jugadorRepository;
        this.equipoRepository = equipoRepository;
    }

    @Override
    @Transactional
    public Fichaje crearFichaje(FichajeDTO dto) {
        try {
            Fichaje fichaje = fichajeMapper.toEntity(dto);
            if (fichaje == null) {
                throw new IllegalArgumentException("Los datos del fichaje no pueden ser nulos");
            }

            if (dto.getJugadorNombre() == null || dto.getJugadorNombre().isEmpty()) {
                throw new IllegalArgumentException("El nombre del jugador es obligatorio");
            }

            if (dto.getEquipoNombre() == null || dto.getEquipoNombre().isEmpty()) {
                throw new IllegalArgumentException("El nombre del equipo es obligatorio");
            }

            if (dto.getFechaInicio() == null) {
                throw new IllegalArgumentException("La fecha de inicio es obligatoria");
            }

            if (dto.getFechaFin() == null) {
                throw new IllegalArgumentException("La fecha de fin es obligatoria");
            }

            if (dto.getCantidad() == null || dto.getCantidad().compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("La cantidad del fichaje debe ser mayor que cero");
            }

            if (dto.getMoneda() == null || dto.getMoneda().isEmpty()) {
                throw new IllegalArgumentException("La moneda es obligatoria");
            }

            if (dto.getMoneda().length() != 3) {
                throw new IllegalArgumentException("El código de la moneda debe tener 3 caracteres (EUR, USD, GPB)");
            }
            if (dto.getTemporada() == null) {
                throw new IllegalArgumentException("La temporada no puede ser nula");
            }
            if (dto.getTipoContrato() == null) {
                throw new IllegalArgumentException("El tipo de contrato es obligatorio");
            }
            List<Fichaje> fichajesActivos = fichajesRepository.findByJugadorAndFechaFin(fichaje.getJugador(),
                    LocalDate.now());
            if (!fichajesActivos.isEmpty()) {
                throw new IllegalArgumentException("El jugador ya tiene un fichaje activo con otro equipo");
            }
            long jugadoresEnEquipo = jugadorRepository.countByEquipo(fichaje.getEquipo());
            if (jugadoresEnEquipo >= 15) {
                throw new IllegalArgumentException("El equipo a alcanzado el máximo de jugadores");
            }

            if (fichaje.getEquipo().getPresupuesto() < dto.getCantidad().doubleValue()) {
                throw new IllegalArgumentException("El equipo no tiene presupuesto suficiente para este fichaje");
            }
            if (dto.getFechaInicio().isAfter(dto.getFechaFin())) {
                throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la de fin");
            }

            Fichaje fichajeGuardado = fichajesRepository.save(fichaje);
            fichaje.getEquipo().setPresupuesto(fichaje.getEquipo().getPresupuesto() - dto.getCantidad().doubleValue());

            return fichajeGuardado;
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos de fichaje invalidos: " + e.getMessage());
        }
    }

    @Override
    public void borrarFichaje(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El id no puede ser ni negativo ni nulo");
        }
    }

    @Override
    @Transactional
    public Fichaje actualizarFichaje(Long id, FichajeDTO dto) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El Id no puede ser negativo ni nulo");
        }
        if (dto == null) {
            throw new IllegalArgumentException("Los datos del fichaje no deben ser nulos");
        }

        Fichaje fichajeExistente = fichajesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fichaje no encontrado con id " + id));

        if (fichajeExistente.getFechaFin().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("No se pueden modificar fichajes ya terminados");
        }
        if (dto.getFechaInicio() != null && dto.getFechaFin() != null) {
            if (dto.getFechaFin().isBefore(dto.getFechaInicio())) {
                throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la fecha de inicio");
            }
        }
        try {
            if (dto.getCantidad() != null && dto.getMoneda() != null) {
                fichajeExistente.setDinero(new com.edu.back.mcs.PracticaFinal.model.ValueObjects.Dinero(
                        dto.getCantidad(), dto.getMoneda()));
            }

            return fichajesRepository.save(fichajeExistente);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error al actualizar el fichaje: " + e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Fichaje> obtenerFichajePorId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El id no puede ser nulo ni negativo");
        }
        return fichajesRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Fichaje> obtenerTodosLosFichajes() {
        return fichajesRepository.findAll();
    }

    @Override
    public List<Fichaje> obtenerFichajesActivos() {
        return fichajesRepository.findFichajesActivos(LocalDate.now());
    }

    @Override
    public List<Fichaje> obtenerFichajesPorTemporada(String temporadaNombre) {
       if (temporadaNombre == null) {
        throw new IllegalArgumentException("La temporada no puede ser nula");
       }
       return fichajesRepository.findByTemporada( new Temporada (temporadaNombre));
    }

    
}
