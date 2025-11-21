package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;

public class PartidoResumenDTO {
    
    private Long partido_id;
    private LocalDate fechaPartido;
    private String equipoLocalNombre;
    private String equipoVisitanteNombre;
    // Se podría añadir resultado si existiera en la entidad, por ahora solo info básica

    public PartidoResumenDTO() {
    }

    public PartidoResumenDTO(Long partido_id, LocalDate fechaPartido, String equipoLocalNombre, String equipoVisitanteNombre) {
        this.partido_id = partido_id;
        this.fechaPartido = fechaPartido;
        this.equipoLocalNombre = equipoLocalNombre;
        this.equipoVisitanteNombre = equipoVisitanteNombre;
    }

    public Long getPartido_id() {
        return partido_id;
    }

    public void setPartido_id(Long partido_id) {
        this.partido_id = partido_id;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getEquipoLocalNombre() {
        return equipoLocalNombre;
    }

    public void setEquipoLocalNombre(String equipoLocalNombre) {
        this.equipoLocalNombre = equipoLocalNombre;
    }

    public String getEquipoVisitanteNombre() {
        return equipoVisitanteNombre;
    }

    public void setEquipoVisitanteNombre(String equipoVisitanteNombre) {
        this.equipoVisitanteNombre = equipoVisitanteNombre;
    }
}
