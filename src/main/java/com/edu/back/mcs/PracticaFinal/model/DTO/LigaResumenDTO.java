package com.edu.back.mcs.PracticaFinal.model.DTO;

public class LigaResumenDTO {
    
    private Long liga_id;
    private String nombre;
    private String pais;
    private int temporadaActual;

    public LigaResumenDTO() {
    }

    public LigaResumenDTO(Long liga_id, String nombre, String pais, int temporadaActual) {
        this.liga_id = liga_id;
        this.nombre = nombre;
        this.pais = pais;
        this.temporadaActual = temporadaActual;
    }

    public Long getLiga_id() {
        return liga_id;
    }

    public void setLiga_id(Long liga_id) {
        this.liga_id = liga_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTemporadaActual() {
        return temporadaActual;
    }

    public void setTemporadaActual(int temporadaActual) {
        this.temporadaActual = temporadaActual;
    }
}
