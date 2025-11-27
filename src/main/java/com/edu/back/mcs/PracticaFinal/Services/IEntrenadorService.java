package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Entrenador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorDetalleDTO;

public interface IEntrenadorService {
    
    Entrenador crearEntrenador(EntrenadorDetalleDTO dto);
    
    Optional<Entrenador> obtenerEntreandorPorId(Long id);

    List<Entrenador> obtenerTodosLosEntrenadores();

    Entrenador actualizarEntrenador(Long id, EntrenadorDetalleDTO dto);

    void borrarEntrenador(Long id);
}
