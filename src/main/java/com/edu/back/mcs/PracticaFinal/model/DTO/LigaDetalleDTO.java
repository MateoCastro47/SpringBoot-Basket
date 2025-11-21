package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;
import java.util.List;

public class LigaDetalleDTO extends LigaResumenDTO {
    
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nivelCompeticion;
    private List<EquipoResumenDTO> equiposParticipantes;

    public LigaDetalleDTO() {
        super();
    }

    public LigaDetalleDTO(Long liga_id, String nombre, String pais, int temporadaActual, LocalDate fechaInicio, LocalDate fechaFin, String nivelCompeticion, List<EquipoResumenDTO> equiposParticipantes) {
        super(liga_id, nombre, pais, temporadaActual);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nivelCompeticion = nivelCompeticion;
        this.equiposParticipantes = equiposParticipantes;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNivelCompeticion() {
        return nivelCompeticion;
    }

    public void setNivelCompeticion(String nivelCompeticion) {
        this.nivelCompeticion = nivelCompeticion;
    }

    public List<EquipoResumenDTO> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List<EquipoResumenDTO> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }
}
