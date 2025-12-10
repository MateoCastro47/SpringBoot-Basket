package com.edu.back.mcs.PracticaFinal.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoDetalleDTO;

public interface IPartidoService {

    Partido crearPartido(PartidoDetalleDTO dto);

    Optional<Partido> obtenerPartidoPorId(Long id);

    List<Partido> obtenerTodosLosPartidos();

    Partido actualizarPartido(Long id, PartidoDetalleDTO dto);

    void borrarPartido(Long id);

    Optional<Partido> buscarPartido(Long equipoLocalId, Long equipoVisitanteId, LocalDate fecha);

}
