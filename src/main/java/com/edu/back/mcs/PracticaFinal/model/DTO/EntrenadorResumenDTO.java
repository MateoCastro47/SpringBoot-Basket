package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.util.List;

public class EntrenadorResumenDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private List<EquipoResumenDTO> equiposEntrenados;

    protected EntrenadorResumenDTO(){

    }

    public EntrenadorResumenDTO(String apellido, List<EquipoResumenDTO> equiposEntrenados, Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.equiposEntrenados = equiposEntrenados;
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

    public List<EquipoResumenDTO> getEquiposEntrenados() {
        return equiposEntrenados;
    }

    public void setEquiposEntrenados(List<EquipoResumenDTO> equiposEntrenados) {
        this.equiposEntrenados = equiposEntrenados;
    }



}
