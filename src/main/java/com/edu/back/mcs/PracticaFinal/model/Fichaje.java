package com.edu.back.mcs.PracticaFinal.model;

import java.time.LocalDate;

import com.edu.back.mcs.PracticaFinal.Enums.TipoContrato;
import com.edu.back.mcs.PracticaFinal.model.ValueObjects.Dinero;
import com.edu.back.mcs.PracticaFinal.model.ValueObjects.Temporada;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fichajes")
public class Fichaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fichaje_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jugador_id", nullable = false)
    private Jugador jugador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipo_id", nullable = false)
    private Equipo equipo;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cantidad", column = @Column(name = "Cantidad", nullable = false, scale = 2)),
            @AttributeOverride(name = "moneda", column = @Column(name = "Moneda", nullable = false, length = 3))
    })
    private Dinero dinero;

    @Embedded
    @AttributeOverride(name = "nombre", column = @Column(name = "Temporada", nullable = false))
    private Temporada temporada;

    @Enumerated(EnumType.STRING)
    @Column(name = "TipoContrato", nullable = false)
    private TipoContrato tipoContrato;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    protected Fichaje() {

    }

    public Fichaje(Dinero dinero, Equipo equipo, LocalDate fechaFin, LocalDate fechaInicio, Long fichaje_id,
            Jugador jugador, Temporada temporada, TipoContrato tipoContrato) {

        if (jugador == null) {
            throw new IllegalArgumentException("El jugador no puede ser nulo");
        }
        if (equipo == null) {
            throw new IllegalArgumentException("El equipo no puede ser nulo");
        }

        if (temporada == null) {
            throw new IllegalArgumentException("La temporada no puede ser nula");
        }

        if (tipoContrato == null) {
            throw new IllegalArgumentException("El contrato no puede ser nulo");
        }

        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas de inicio y fin no pueden ser nulas");
        }

        if (fechaFin != null && fechaFin.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la de inicio");
        }

        this.dinero = dinero;
        this.equipo = equipo;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.fichaje_id = fichaje_id;
        this.jugador = jugador;
        this.temporada = temporada;
        this.tipoContrato = tipoContrato;
    }

    public Long getFichaje_id() {
        return fichaje_id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Dinero getDinero() {
        return dinero;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
}
