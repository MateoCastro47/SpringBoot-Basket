package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IJugadorService;
import com.edu.back.mcs.PracticaFinal.mappers.JugadorMapper;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.JugadorRepository;

@Service
public class JugadorServiceimpl implements IJugadorService {

    private final JugadorRepository jugadorRepository;
    private final JugadorMapper jugadorMapper;

    public JugadorServiceimpl(JugadorRepository jugadorRepository, JugadorMapper jugadorMapper) {
        this.jugadorRepository = jugadorRepository;
        this.jugadorMapper = jugadorMapper;
    }

    @Override
    @Transactional
    public Jugador actualizarJugador(Long id, JugadorDetalleDTO dto) {
        try {
            Jugador jugadorExistente = jugadorRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Jugador no encontrado con id " + id));

            jugadorMapper.updateEntityFromDTO(dto, jugadorExistente);

            return jugadorRepository.save(jugadorExistente);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos del jugador invalidos");
        }
    }

    @Override
    @Transactional
    public void borrarJugador(Long id) {
        if (jugadorRepository.existsById(id)) {
            jugadorRepository.deleteById(id);
        } else {
            throw new RuntimeException("Jugador no encontrado con el id " + id);
        }
    }

    @Override
    @Transactional
    public Jugador crearJugador(JugadorDetalleDTO dto) {
        Jugador jugador = jugadorMapper.toEntity(dto);

        // Validar que el jugador no tenga el mismo dorsal dentro de un equipo
        if (jugador.getEquipo() != null) {
            boolean dorsalExistente = jugadorRepository.existByDorsalAndEquipo(dto.getDorsal(), dto.getEquipoResumenDTO());
        
        if (dorsalExistente) {
            throw new IllegalArgumentException("Ya existe un jugador con el dorsal: " + dto.getDorsal() + " en el equipo: " + dto.getEquipoResumenDTO());    
        }
        }
        
        return jugadorRepository.save(jugador);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Jugador> obtenerTodosLosJugadores() {
        return jugadorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Jugador> obtenerjugadorPorId(Long id) {
        return jugadorRepository.findById(id);
    }

}
