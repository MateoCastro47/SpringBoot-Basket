package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadisticasJugadorDTO;

public interface IEstadisticasJugadorService {

    EstadisticasJugador crearEstadisticas(EstadisticasJugadorDTO dto);

    Optional<EstadisticasJugador> obtenerEstadisticasPorId(Long id);

    List<EstadisticasJugador> obtenerTodasLasEstadisticas();

    void borrarEstadisticas(Long id);

    EstadisticasJugador actualizarEstadisticas(Long id, EstadisticasJugadorDTO dto);
}
