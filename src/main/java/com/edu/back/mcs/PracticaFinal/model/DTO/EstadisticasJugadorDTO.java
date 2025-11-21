package com.edu.back.mcs.PracticaFinal.model.DTO;

public class EstadisticasJugadorDTO {
    
    private Long estadisticas_id;
    private String jugadorNombre;
    private Long partidoId;
    private Integer puntos;
    private Integer asistencias;
    private Integer rebotes;
    private Integer minutosJugados;

    public EstadisticasJugadorDTO() {
    }

    public EstadisticasJugadorDTO(Long estadisticas_id, String jugadorNombre, Long partidoId, Integer puntos, Integer asistencias, Integer rebotes, Integer minutosJugados) {
        this.estadisticas_id = estadisticas_id;
        this.jugadorNombre = jugadorNombre;
        this.partidoId = partidoId;
        this.puntos = puntos;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.minutosJugados = minutosJugados;
    }

    public Long getEstadisticas_id() {
        return estadisticas_id;
    }

    public void setEstadisticas_id(Long estadisticas_id) {
        this.estadisticas_id = estadisticas_id;
    }

    public String getJugadorNombre() {
        return jugadorNombre;
    }

    public void setJugadorNombre(String jugadorNombre) {
        this.jugadorNombre = jugadorNombre;
    }

    public Long getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Long partidoId) {
        this.partidoId = partidoId;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public void setRebotes(Integer rebotes) {
        this.rebotes = rebotes;
    }

    public Integer getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(Integer minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
}
