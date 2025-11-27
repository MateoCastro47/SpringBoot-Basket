package com.edu.back.mcs.PracticaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Entrenador;

public interface EntrenadorRepository extends JpaRepository<Entrenador,Long>{
    
    boolean existsByNombreAndApellido(String nombre, String apellido);
}
