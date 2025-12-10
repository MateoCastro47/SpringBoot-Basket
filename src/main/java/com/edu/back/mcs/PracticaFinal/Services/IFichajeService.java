package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.DTO.FichajeDTO;

public interface IFichajeService {

    Fichaje crearFichaje(FichajeDTO dto);

    Optional<Fichaje> obtenerFichajePorId(Long id);

    List<Fichaje> obtenerTodosLosFichajes();

    void borrarFichaje(Long id);

    Fichaje actualizarFichaje(Long id, FichajeDTO dto);

    List<Fichaje> obtenerFichajesActivos();
    List<Fichaje> obtenerFichajesPorTemporada(String temporadaNombre);
}
