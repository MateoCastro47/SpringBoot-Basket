package com.edu.back.mcs.PracticaFinal.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Liga")
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long liga_id;
    @Column(name = "Nombre", nullable = false, length = 55)
    private String nombre;
    @Column(name = "Pais", nullable = false)
    private String pais;
    @Column(name = "temporadaActual", nullable = false)
    private int temporadaActual;
    @Column(name = "FechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "FechaFin", nullable = false)
    private LocalDate fechaFin;
    @Column(name = "nivelCompeticion", nullable = false)
    private String nivelCompeticion;

    @OneToMany(mappedBy = "liga")
    private List<Equipo> equiposParticipantes;

    public Liga() {
    }

    public Liga(List<Equipo> equiposParticipantes, LocalDate fechaFin, LocalDate fechaInicio, Long liga_id,
            String nivelCompeticion, String nombre, String pais, int temporadaActual) {
        this.equiposParticipantes = equiposParticipantes;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.liga_id = liga_id;
        this.nivelCompeticion = nivelCompeticion;
        this.nombre = nombre;
        this.pais = pais;
        this.temporadaActual = temporadaActual;
    }

    public Long getLiga_id() {
        return liga_id;
    }

    public void setLiga_id(Long liga_id) {
        this.liga_id = liga_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTemporadaActual() {
        return temporadaActual;
    }

    public void setTemporadaActual(int temporadaActual) {
        this.temporadaActual = temporadaActual;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNivelCompeticion() {
        return nivelCompeticion;
    }

    public void setNivelCompeticion(String nivelCompeticion) {
        this.nivelCompeticion = nivelCompeticion;
    }

    public List<Equipo> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List<Equipo> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

}
