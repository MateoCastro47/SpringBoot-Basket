package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;

public interface IJugadorService {
    Jugador crearJugador(JugadorDetalleDTO dto);

    Optional<Jugador> obtenerjugadorPorId(Long id);

    List<Jugador> obtenerTodosLosJugadores();

    Jugador actualizarJugador(Long id, JugadorDetalleDTO dto);

    void borrarJugador(Long id);
}
