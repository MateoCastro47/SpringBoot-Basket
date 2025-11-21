package com.edu.back.mcs.PracticaFinal.model.DTO;

import com.edu.back.mcs.PracticaFinal.Enums.Posicion;

/**
 * DTO resumen para la entidad Jugador.
 * Se utiliza para mostrar información básica del jugador en listados.
 */
public class JugadorResumenDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Posicion posicion;
    private int dorsal;

    public JugadorResumenDTO() {
    }

    public JugadorResumenDTO(Long id, String nombre, String apellido, Posicion posicion, int dorsal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.dorsal = dorsal;
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

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
