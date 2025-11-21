package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;
import java.util.List;

public class PartidoDetalleDTO extends PartidoResumenDTO {
    
    private String estadioNombre;
    private List<EstadisticasJugadorDTO> estadisticas;

    public PartidoDetalleDTO() {
        super();
    }

    public PartidoDetalleDTO(Long partido_id, LocalDate fechaPartido, String equipoLocalNombre, String equipoVisitanteNombre, String estadioNombre, List<EstadisticasJugadorDTO> estadisticas) {
        super(partido_id, fechaPartido, equipoLocalNombre, equipoVisitanteNombre);
        this.estadioNombre = estadioNombre;
        this.estadisticas = estadisticas;
    }

    public String getEstadioNombre() {
        return estadioNombre;
    }

    public void setEstadioNombre(String estadioNombre) {
        this.estadioNombre = estadioNombre;
    }

    public List<EstadisticasJugadorDTO> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticasJugadorDTO> estadisticas) {
        this.estadisticas = estadisticas;
    }
}
