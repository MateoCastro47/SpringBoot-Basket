package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;
import java.util.List;

public class EntrenadorDetalleDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private List<EquipoResumenDTO> equiposEntrenados;
    private double Sueldo;

    protected EntrenadorDetalleDTO(){

    }

    public EntrenadorDetalleDTO(double Sueldo, String apellido, List<EquipoResumenDTO> equiposEntrenados, LocalDate fechaNacimiento, Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.equiposEntrenados = equiposEntrenados;
        this.fechaNacimiento = fechaNacimiento;
        this.Sueldo = Sueldo;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<EquipoResumenDTO> getEquiposEntrenados() {
        return equiposEntrenados;
    }

    public void setEquiposEntrenados(List<EquipoResumenDTO> equiposEntrenados) {
        this.equiposEntrenados = equiposEntrenados;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    
}
