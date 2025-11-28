package com.edu.back.mcs.PracticaFinal.model;

import java.util.List;

import com.edu.back.mcs.PracticaFinal.Enums.Posicion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;
    @Column(name = "Edad", nullable = false)
    private int edad;
    @Column(name = "Dorsal", nullable = false)
    private int dorsal;
    @Enumerated(EnumType.STRING)
    @Column(name = "Posicion", nullable = false, length = 50)
    private Posicion posicion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador", fetch = FetchType.LAZY)
    private List<EstadisticasJugador> estadisticas;

    @OneToMany(mappedBy = "jugador", fetch = FetchType.LAZY)
    private List<Fichaje> fichajes;

    public Jugador() {
    }

    public Jugador(int dorsal, int edad, Equipo equipo, Long id, String apellido, String nombre, Posicion posicion,
            List<EstadisticasJugador> estadisticas) {
        this.dorsal = dorsal;
        this.edad = edad;
        this.equipo = equipo;
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estadisticas = estadisticas;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<EstadisticasJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticasJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public List<Fichaje> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<Fichaje> fichajes) {
        this.fichajes = fichajes;
    }

}
