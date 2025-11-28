package com.edu.back.mcs.PracticaFinal.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estadio_id;
    @Column(name = "Nombre", nullable = false, length = 255)
    private String nombre;
    @Column(name = "Ciudad", nullable = false, length = 155)
    private String ciudad;
    @Column(name = "Capacidad", nullable = false)
    private double Capacidad;

    @OneToOne(mappedBy = "estadio", fetch = FetchType.LAZY)
    private Equipo equipo;

    @OneToMany(mappedBy = "estadio", fetch = FetchType.LAZY)
    private List<Partido> partidos;

    public Estadio() {
    }

    public Estadio(double Capacidad, String ciudad, Equipo equipo, Long estadio_id, String nombre,
            List<Partido> partidos) {
        this.Capacidad = Capacidad;
        this.ciudad = ciudad;
        this.equipo = equipo;
        this.estadio_id = estadio_id;
        this.nombre = nombre;
        this.partidos = partidos;
    }

    public Long getEstadio_id() {
        return estadio_id;
    }

    public void setEstadio_id(Long estadio_id) {
        this.estadio_id = estadio_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
