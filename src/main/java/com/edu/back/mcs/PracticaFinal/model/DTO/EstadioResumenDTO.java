package com.edu.back.mcs.PracticaFinal.model.DTO;

public class EstadioResumenDTO {
    
    private Long estadio_id;
    private String nombre;
    private String ciudad;
    private double capacidad;

    public EstadioResumenDTO() {
    }

    public EstadioResumenDTO(Long estadio_id, String nombre, String ciudad, double capacidad) {
        this.estadio_id = estadio_id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
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
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
