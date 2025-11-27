package com.edu.back.mcs.PracticaFinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio, Long>{
    
    //Validar si existe un estadio con el mismo nombre en la misma ciudad
    boolean existsByNombreAndCiudad(String nombre, String ciudad);
    
    //Buscar por nombre y ciudad (para Actualización)
    Optional<Estadio> findByNombreAndCiudad(String nombre, String ciudad);
}
