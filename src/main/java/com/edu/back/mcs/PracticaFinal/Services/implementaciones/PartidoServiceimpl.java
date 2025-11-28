package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IPartidoService;
import com.edu.back.mcs.PracticaFinal.mappers.PartidoMapper;
import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.PartidoRepository;

@Service
public class PartidoServiceimpl implements IPartidoService{
    
    public final PartidoRepository partidoRepository;
    public final PartidoMapper partidoMapper;

    
    public PartidoServiceimpl(PartidoRepository partidoRepository, PartidoMapper partidoMapper) {
        this.partidoRepository = partidoRepository;
        this.partidoMapper = partidoMapper;
    }


    @Override
    public Partido actualizarPartido(Long id, PartidoDetalleDTO dto) {
        try{
            Partido partidoExistente = partidoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Partido no encontrado con id: " + id)
            );
            partidoMapper.updateEntityFromDTO(dto, partidoExistente);
            
            //Aplicar mismas validaciones que en crear partido

            if (partidoExistente.getEquipoLocal() != null && partidoExistente.getEquipoVisitante() != null) {
                if (partidoExistente.getEquipoLocal().getId().equals(partidoExistente.getEquipoVisitante().getId())) {
                    throw new IllegalArgumentException("Los equipos enfrentados no pueden ser los mismos");
                }
            }

            if (partidoExistente.getEstadio() == null) {
                throw new IllegalArgumentException("Cada partido debe tener un estadio asignado");
            }

            Optional<Partido> otroPartido = partidoRepository.findByEquipoLocalAndEquipoVisitanteAndFecha(partidoExistente.getEquipoLocal(),
            partidoExistente.getEquipoVisitante(), partidoExistente.getFechaPartido());
            if (otroPartido.isPresent() && !otroPartido.get().getPartido_id().equals(id)) {
                throw new IllegalArgumentException("Ya existe otro partido entre estos equipos en esta fecha");
            }

            if (partidoExistente.getFechaPartido() == null) {
                throw new IllegalArgumentException("El partido debe tener una fecha asignada");
            }

            if (partidoExistente.getEquipoLocal().getLiga() != null && partidoExistente.getEquipoVisitante().getLiga() != null) {
                if (!partidoExistente.getEquipoLocal().getLiga().getLiga_id().equals(partidoExistente.getEquipoVisitante().getLiga().getLiga_id())) {
                    throw new IllegalArgumentException("Los equipos deben pertenecer a la misma liga");
                }
            }
            return partidoRepository.save(partidoExistente);
        }catch(IllegalArgumentException e){
            throw new RuntimeException("Datos del partido inválidos " + e.getMessage());
        }
        
    }


    @Override
    @Transactional
    public void borrarPartido(Long id) {
        if (partidoRepository.existsById(id)) {
            partidoRepository.deleteById(id);
        }        
    }


    @Override
    @Transactional
    public Partido crearPartido(PartidoDetalleDTO dto) {
        Partido partido = partidoMapper.toEntity(dto);
        // Validación 1: Equipos diferentes
        if (partido.getEquipoLocal() != null && partido.getEquipoVisitante() != null) {
            if (partido.getEquipoLocal().getId().equals(partido.getEquipoVisitante().getId())) {
                throw new IllegalArgumentException("El equipo local no puede ser el mismo que el visitante");
            }
        }
        // Validación 2: Deben tener estadio asignado
        if (partido.getEstadio() == null) {
            throw new IllegalArgumentException("El partido debe tener estadio asignado");
        }
        // Validación 3: No se puede duplicar partido
        if (partidoRepository.existsByEquipoLocalAndEquipoVisitanteAndFecha(partido.getEquipoLocal(), partido.getEquipoVisitante(), partido.getFechaPartido())) {
            throw new IllegalArgumentException("Ya existe un partido entre: " + partido.getEquipoLocal() + " y " + partido.getEquipoVisitante() + " en la fecha " + partido.getFechaPartido());
        }
        // Validación 4: Debe tener una fecha
        if (partido.getFechaPartido() == null) {
            throw new IllegalArgumentException("El partido ya tiene una fecha asignada");
        }
        // Validación 5: Debe ser entre equipos de la misma liga
        if (partido.getEquipoLocal().getLiga() != null && partido.getEquipoVisitante().getLiga() != null) {
            if (!partido.getEquipoLocal().getLiga().getLiga_id().equals(partido.getEquipoVisitante().getLiga().getLiga_id())) {
                throw new IllegalArgumentException("El partido debe ser entre dos equipos de la misma liga");
            }
        }
        return partidoRepository.save(partido);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Partido> obtenerPartidoPorId(Long id) {
        return partidoRepository.findById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Partido> obtenerTodosLosPartidos() {
        return partidoRepository.findAll();
    }

    
}
