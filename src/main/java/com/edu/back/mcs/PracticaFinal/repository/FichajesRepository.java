package com.edu.back.mcs.PracticaFinal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.ValueObjects.Temporada;



public interface FichajesRepository extends JpaRepository<Fichaje, Long>{

    List<Fichaje> findByJugadorAndFechaFin(Jugador jugador, LocalDate fechaFin);
    
    List<Fichaje> findByJugador(Jugador jugador);

    List<Fichaje> findByTemporada(Temporada temporada);

    @Query("SELECT f FROM Fichaje f WHERE f.fechaFin > :fecha")
    List<Fichaje> findFichajesActivos(@Param("fecha") LocalDate fecha);
}
