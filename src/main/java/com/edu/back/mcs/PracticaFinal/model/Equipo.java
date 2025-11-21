package com.edu.back.mcs.PracticaFinal.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Equipo")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "Fundación", nullable = false)
    private LocalDate fechaFundacion;
    @Column(name = "Ciudad", nullable = false, length = 155)
    private String ciudad;
    @Column(name = "Presupuesto", nullable = false)
    private double presupuesto;

    @ManyToOne
    @JoinColumn(name = "Entrenador_id")
    private Entrenador entrenador;

    @OneToMany(mappedBy = "equipo")
    private List<Jugador> Jugadores;

    @OneToOne
    @JoinColumn(name = "Estadio_id")
    private Estadio estadio;

    @ManyToOne
    @JoinColumn(name = "liga_id")
    private Liga liga;

    @OneToMany(mappedBy = "equipoLocal")
    private List<Partido> partidosLocal;

    @OneToMany(mappedBy = "equipoVisitante")
    private List<Partido> partidosVisitante;

    @OneToMany(mappedBy = "equipo")
    private List<Fichaje> fichajes;

    public Equipo() {
    }

    public Equipo(Estadio estadio, Entrenador entrenador, Liga liga, LocalDate fechaFundacion, double presupuesto,
            Long id, String ciudad, String nombre, List<Jugador> jugadores, List<Partido> partidosLocal,
            List<Partido> partidosVisitante) {
        this.estadio = estadio;
        this.entrenador = entrenador;
        this.liga = liga;
        this.fechaFundacion = fechaFundacion;
        this.presupuesto = presupuesto;
        this.id = id;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.Jugadores = jugadores;
        this.partidosLocal = partidosLocal;
        this.partidosVisitante = partidosVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public List<Partido> getPartidosLocal() {
        return partidosLocal;
    }

    public void setPartidosLocal(List<Partido> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }

    public List<Partido> getPartidosVisitante() {
        return partidosVisitante;
    }

    public void setPartidosVisitante(List<Partido> partidosVisitante) {
        this.partidosVisitante = partidosVisitante;
    }

    public List<Fichaje> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<Fichaje> fichajes) {
        this.fichajes = fichajes;
    }

}
