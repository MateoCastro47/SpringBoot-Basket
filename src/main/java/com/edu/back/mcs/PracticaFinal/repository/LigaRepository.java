package com.edu.back.mcs.PracticaFinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Liga;

public interface LigaRepository extends JpaRepository<Liga, Long> {

    // Verificar si existe una liga con el mismo nombre en el mismo pais
    boolean existsByNombreAndPais(String nombre, String pais);

    // Buscar liga por nombre y pais (para Actualización)
    Optional<Liga> findByNombreAndPais(String nombre, String pais);
}
