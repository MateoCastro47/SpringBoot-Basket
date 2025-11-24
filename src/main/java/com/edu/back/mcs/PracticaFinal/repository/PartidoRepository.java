package com.edu.back.mcs.PracticaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Long>{
    
}
