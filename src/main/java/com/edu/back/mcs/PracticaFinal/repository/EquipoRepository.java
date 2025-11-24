package com.edu.back.mcs.PracticaFinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{
    Optional<Equipo> findByNombreAndLigaId(String nombre, Long Liga_id);
}
