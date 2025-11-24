package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;

import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoDetalleDTO;

public interface IEquipoService {
    Equipo crearEquipo(EquipoDetalleDTO dto);

    Optional<Equipo> obtenerEquipoPorId(Long id);

    List<Equipo> obtenerTodosLosEquipos();

    Equipo actualizarEquipo(Long id, EquipoDetalleDTO dto);

    void borrarEquipo(Long id);
}
