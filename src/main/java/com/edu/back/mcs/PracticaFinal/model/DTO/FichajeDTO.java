package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.edu.back.mcs.PracticaFinal.Enums.TipoContrato;
import com.edu.back.mcs.PracticaFinal.model.ValueObjects.Temporada;

public class FichajeDTO {
    
    private Long fichaje_id;
    private String jugadorNombre;
    private String equipoNombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private TipoContrato tipoContrato;
    private BigDecimal cantidad;
    private String moneda;
    private Temporada temporada;

    public FichajeDTO() {
    }

    public FichajeDTO(Long fichaje_id, String jugadorNombre, String equipoNombre, LocalDate fechaInicio, LocalDate fechaFin, TipoContrato tipoContrato, BigDecimal cantidad, String moneda, Temporada temporada) {
        this.fichaje_id = fichaje_id;
        this.jugadorNombre = jugadorNombre;
        this.equipoNombre = equipoNombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoContrato = tipoContrato;
        this.cantidad = cantidad;
        this.moneda = moneda;
        this.temporada = temporada;
    }

    public Long getFichaje_id() {
        return fichaje_id;
    }

    public void setFichaje_id(Long fichaje_id) {
        this.fichaje_id = fichaje_id;
    }

    public String getJugadorNombre() {
        return jugadorNombre;
    }

    public void setJugadorNombre(String jugadorNombre) {
        this.jugadorNombre = jugadorNombre;
    }

    public String getEquipoNombre() {
        return equipoNombre;
    }

    public void setEquipoNombre(String equipoNombre) {
        this.equipoNombre = equipoNombre;
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

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
}
