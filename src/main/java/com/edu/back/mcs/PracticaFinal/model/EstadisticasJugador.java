package com.edu.back.mcs.PracticaFinal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EstadisticasJugador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadisticas_id;

    @ManyToOne
    @JoinColumn(name = "jugador_id")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "partido_id")
    private Partido partido;

    // Información adicional, por ejemplo:
    @Column(name="Puntos", nullable=false)
    private Integer puntos;
    @Column(name="Asistencias", nullable=false)
    private Integer asistencias;
    @Column(name="Rebotes", nullable=false)
    private Integer rebotes;
    @Column(name="Minutos", nullable=false)
    private Integer minutosJugados;

    public EstadisticasJugador() {
    }

    public EstadisticasJugador(Integer asistencias, Long estadisticas_id, Jugador jugador, Integer minutosJugados, Partido partido, Integer puntos, Integer rebotes) {
        this.asistencias = asistencias;
        this.estadisticas_id = estadisticas_id;
        this.jugador = jugador;
        this.minutosJugados = minutosJugados;
        this.partido = partido;
        this.puntos = puntos;
        this.rebotes = rebotes;
    }

    public Long getEstadisticas_id() {
        return estadisticas_id;
    }

    public void setEstadisticas_id(Long estadisticas_id) {
        this.estadisticas_id = estadisticas_id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public Integer getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(Integer minutosJugados) {
        this.minutosJugados = minutosJugados;
    }


}
