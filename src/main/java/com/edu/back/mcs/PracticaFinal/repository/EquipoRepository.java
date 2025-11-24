package com.edu.back.mcs.PracticaFinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    @org.springframework.data.jpa.repository.Query("SELECT e FROM Equipo e WHERE e.nombre = :nombre AND e.liga.liga_id = :ligaId")
    Optional<Equipo> findByNombreAndLigaId(@org.springframework.data.repository.query.Param("nombre") String nombre,
            @org.springframework.data.repository.query.Param("ligaId") Long ligaId);
}
