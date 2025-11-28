package com.edu.back.mcs.PracticaFinal.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Entrenador")
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entrenador_id;
    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "Apellido", nullable = false, length = 200)
    private String apellido;
    @Column(name = "Fecha_Nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "Sueldo", nullable = false)
    private double Sueldo;

    @OneToMany(mappedBy = "entrenador", fetch = FetchType.LAZY)
    private List<Equipo> equiposEntrenados;

    public Entrenador() {
    }

    public Entrenador(double Sueldo, String apellido, Long entrenador_id, List<Equipo> equiposEntrenados,
            LocalDate fechaNacimiento, String nombre) {
        this.Sueldo = Sueldo;
        this.apellido = apellido;
        this.entrenador_id = entrenador_id;
        this.equiposEntrenados = equiposEntrenados;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public Long getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(Long entrenador_id) {
        this.entrenador_id = entrenador_id;
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

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public List<Equipo> getEquiposEntrenados() {
        return equiposEntrenados;
    }

    public void setEquiposEntrenados(List<Equipo> equiposEntrenados) {
        this.equiposEntrenados = equiposEntrenados;
    }

}
