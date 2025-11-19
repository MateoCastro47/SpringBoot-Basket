package com.edu.back.mcs.PracticaFinal.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Partidos")
public class Partido {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long partido_id;
    @Column(name="FechaPartido", nullable= false)
    private LocalDate fechaPartido;
    
    @ManyToOne
    @JoinColumn(name = "equipo_local_id")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante_id")
    private Equipo equipoVisitante;

    @ManyToOne
    @JoinColumn(name = "estadio_id")
    private Estadio estadio;

    @OneToMany(mappedBy = "partido")
    private List<EstadisticasJugador> estadisticas;

    public Partido() {
    }
    
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Estadio estadio, LocalDate fechaPartido, Long partido_id, List<EstadisticasJugador> estadisticas) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.fechaPartido = fechaPartido;
        this.partido_id = partido_id;
        this.estadisticas = estadisticas;
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

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public List<EstadisticasJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticasJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }


}
