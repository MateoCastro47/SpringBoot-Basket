package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.util.List;

public class EstadioDetalleDTO extends EstadioResumenDTO {
    
    private String equipoNombre;
    private List<PartidoResumenDTO> PartidoResumenDTO; // O una lista de PartidoResumenDTO si se prefiere, pero IDs es más ligero para detalle de estadio

    public EstadioDetalleDTO() {
        super();
    }

    public EstadioDetalleDTO(Long estadio_id, String nombre, String ciudad, double capacidad, String equipoNombre, List<Long> partidosIds) {
        super(estadio_id, nombre, ciudad, capacidad);
        this.equipoNombre = equipoNombre;
        this.PartidoResumenDTO = PartidoResumenDTO;
    }

    public String getEquipoNombre() {
        return equipoNombre;
    }

    public void setEquipoNombre(String equipoNombre) {
        this.equipoNombre = equipoNombre;
    }

    public List<PartidoResumenDTO> getPartidosIds() {
        return PartidoResumenDTO;
    }

    public void setPartidosIds(List<PartidoResumenDTO> partidosIds) {
        this.PartidoResumenDTO = partidosIds;
    }
}
