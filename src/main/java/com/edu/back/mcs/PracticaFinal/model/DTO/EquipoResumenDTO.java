package com.edu.back.mcs.PracticaFinal.model.DTO;

public class EquipoResumenDTO {

    private Long id;
    private String nombre;
    private String ciudad;

    public EquipoResumenDTO() {
    }

    public EquipoResumenDTO(Long id, String nombre, String ciudad){
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
