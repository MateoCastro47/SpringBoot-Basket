package com.edu.back.mcs.PracticaFinal.model.ValueObjects;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public final class ResultadoPartido{
    private final int puntosEquipoLocal;
    private final int puntosEquipoVisitante;
    protected ResultadoPartido() {
        this.puntosEquipoLocal = 0;
        this.puntosEquipoVisitante = 0;
    }
    public ResultadoPartido(int puntosEquipoLocal, int puntosEquipoVisitante){
        if(puntosEquipoLocal < 0 || puntosEquipoVisitante < 0){
            throw new IllegalArgumentException("Los puntos no pueden ser negativos");
        }
        this.puntosEquipoLocal = puntosEquipoLocal;
        this.puntosEquipoVisitante = puntosEquipoVisitante;
    }

    public int getPuntosEquipoLocal() {
        return puntosEquipoLocal;
    }

    public int getPuntosEquipoVisitante() {
        return puntosEquipoVisitante;
    }

     @Override
    public int hashCode() {
        return Objects.hash(puntosEquipoLocal, puntosEquipoVisitante);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultadoPartido)) return false;
        ResultadoPartido that = (ResultadoPartido) o;
        return puntosEquipoLocal == that.puntosEquipoLocal &&
               puntosEquipoVisitante == that.puntosEquipoVisitante;
    }

    @Override
    public String toString() {
        return "ResultadoPartido{" +
                "puntosEquipoLocal=" + puntosEquipoLocal +
                ", puntosEquipoVisitante=" + puntosEquipoVisitante +
                '}';
    }

}
