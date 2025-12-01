package com.edu.back.mcs.PracticaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoResumenDTO;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    boolean existByDorsalAndEquipo(int dorsal, EquipoResumenDTO equipoResumenDTO);

    long countByEquipo(com.edu.back.mcs.PracticaFinal.model.Equipo equipo);
}
