package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Estadio;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioDetalleDTO;

public interface IEstadioService {
    
    Estadio crearEstadio(EstadioDetalleDTO dto);

    Optional<Estadio> obtenerEstadioPorId(Long id);

    List<Estadio> obtenerTodosLosEstadios();

    Estadio actualizarEstadio(Long id, EstadioDetalleDTO dto);

    void borrarEstadio(Long id);
}
