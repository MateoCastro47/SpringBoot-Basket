package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IEstadisticasJugadorService;
import com.edu.back.mcs.PracticaFinal.mappers.EstadisticasJugadorMapper;
import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadisticasJugadorDTO;
import com.edu.back.mcs.PracticaFinal.repository.EstadisticasRepository;

@Service
public class EstadisticasJugadorimpl implements IEstadisticasJugadorService{
    private final EstadisticasRepository estadisticasRepository;
    private final EstadisticasJugadorMapper estadisticasJugadorMapper;

    
    public EstadisticasJugadorimpl(EstadisticasRepository estadisticasRepository,
            EstadisticasJugadorMapper estadisticasJugadorMapper) {
        this.estadisticasRepository = estadisticasRepository;
        this.estadisticasJugadorMapper = estadisticasJugadorMapper;
    }


    @Override
    @Transactional
    public EstadisticasJugador actualizarEstadisticas(Long id, EstadisticasJugadorDTO dto) {
       EstadisticasJugador estadisticasExistentes = estadisticasRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encuentran estadísticas con id " + id));
        if (dto == null) {
            throw new IllegalArgumentException("Los datos de las estadísticas no pueden ser nulos");
        }
         if (dto.getJugadorNombre() == null || dto.getJugadorNombre().isEmpty()) {
        throw new IllegalArgumentException("El nombre del jugador es obligatorio");
        }
        if (dto.getPartidoId() == null) {
            throw new IllegalArgumentException("El ID del partido es obligatorio");
        }
        if (dto.getPuntos() == null || dto.getPuntos() < 0) {
            throw new IllegalArgumentException("Los puntos no pueden ser nulos ni negativos");
        }
        if (dto.getAsistencias() == null || dto.getAsistencias() < 0) {
            throw new IllegalArgumentException("Las Asistencias no pueden ser nulas ni negativas");
        }
        if (dto.getRebotes() == null || dto.getRebotes() < 0) {
            throw new IllegalArgumentException("Los rebotes no pueden ser nulos ni negativos");
        }
        if (dto.getMinutosJugados() == null || dto.getMinutosJugados() < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser nulos ni negativos");
        }
        estadisticasJugadorMapper.updateEntityFromDTO(dto, estadisticasExistentes);
        return estadisticasRepository.save(estadisticasExistentes);
        }


    @Override
    @Transactional
    public void borrarEstadisticas(Long id) {
        if (estadisticasRepository.existsById(id)) {
            estadisticasRepository.deleteById(id);
        }        
    }


    @Override
    @Transactional
    public EstadisticasJugador crearEstadisticas(EstadisticasJugadorDTO dto) {
    try{
    if (dto == null) {
        throw new IllegalArgumentException("Los datos no pueden ser nulos");
    }    
    if (dto.getJugadorNombre() == null || dto.getJugadorNombre().isEmpty()) {
        throw new IllegalArgumentException("El nombre del jugador es obligatorio");
    }
    if (dto.getPartidoId() == null) {
        throw new IllegalArgumentException("El ID del partido es obligatorio");
    }
    if (dto.getPuntos() == null || dto.getPuntos() < 0) {
        throw new IllegalArgumentException("Los puntos no pueden ser nulos ni negativos");
    }
    if (dto.getAsistencias() == null || dto.getAsistencias() < 0) {
        throw new IllegalArgumentException("Las Asistencias no pueden ser nulas ni negativas");
    }
    if (dto.getRebotes() == null || dto.getRebotes() < 0) {
        throw new IllegalArgumentException("Los rebotes no pueden ser nulos ni negativos");
    }
    if (dto.getMinutosJugados() == null || dto.getMinutosJugados() < 0) {
        throw new IllegalArgumentException("Los minutos no pueden ser nulos ni negativos");
    }
    EstadisticasJugador estadisticas = estadisticasJugadorMapper.toEntity(dto);
    if (estadisticas.getJugador() == null) {
        throw new IllegalArgumentException("El jugador no se identificó correctamente");
    }
    if (estadisticas.getPartido() == null) {
        throw new IllegalArgumentException("El partido no se identificó correctamente");
    }
    return estadisticasRepository.save(estadisticas);
    }catch(IllegalArgumentException e){
        throw new RuntimeException("Error al crear las estadísticas " + e.getMessage());
    }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EstadisticasJugador> obtenerEstadisticasPorId(Long id) {
        return estadisticasRepository.findById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public List<EstadisticasJugador> obtenerTodasLasEstadisticas() {
        return estadisticasRepository.findAll();
    }

    

}
