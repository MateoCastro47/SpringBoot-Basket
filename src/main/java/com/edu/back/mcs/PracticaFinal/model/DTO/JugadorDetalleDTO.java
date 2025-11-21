package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.util.List;

import com.edu.back.mcs.PracticaFinal.Enums.Posicion;

/**
 * DTO detalle para la entidad Jugador.
 * Se utiliza para mostrar toda la información detallada del jugador, incluyendo sus relaciones.
 */
public class JugadorDetalleDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private int dorsal;
    private Posicion posicion;
    private EquipoResumenDTO equipoResumenDTO;
    private List<EstadisticasJugadorDTO> estadisticasJugador;
    private List<FichajeDTO> fichajes;

    public JugadorDetalleDTO() {
    }
    
    public JugadorDetalleDTO(Long id, String nombre, String apellido, int edad, int dorsal, Posicion posicion, EquipoResumenDTO equipoResumenDTO, List<EstadisticasJugadorDTO> estadisticasjugador, List<FichajeDTO> fichajes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.equipoResumenDTO = equipoResumenDTO;
        this.estadisticasJugador = estadisticasJugador;
        this.fichajes = fichajes;
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

    public EquipoResumenDTO getEquipoResumenDTO() {
        return equipoResumenDTO;
    }

    public void setEquipoResumenDTO(EquipoResumenDTO equipoResumenDTO) {
        this.equipoResumenDTO = equipoResumenDTO;
    }

    public List<EstadisticasJugadorDTO> getEstadisticas() {
        return estadisticasJugador;
    }

    public void setEstadisticasIds(List<EstadisticasJugadorDTO> estadisticas) {
        this.estadisticasJugador = estadisticas;
    }

    public List<FichajeDTO> getFichajes() {
        return fichajes;
    }

    public void setFichajesIds(List<FichajeDTO> fichajes) {
        this.fichajes = fichajes;
    }
}
