package com.edu.back.mcs.PracticaFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;

public interface EstadisticasRepository extends JpaRepository<EstadisticasJugador, Long>{
    
}
