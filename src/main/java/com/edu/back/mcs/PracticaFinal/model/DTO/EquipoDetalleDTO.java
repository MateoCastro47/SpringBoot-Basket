package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;
import java.util.List;

public class EquipoDetalleDTO {
    private Long id;
    private String nombre;
    private LocalDate fechaFundacion;
    private String ciudad;
    private double presupuesto;
    private EntrenadorResumenDTO entrenador;
    private List<JugadorResumenDTO> Jugadores;
    private EstadioResumenDTO estadio;
    private LigaResumenDTO liga;
    private List<PartidoResumenDTO> partidosLocal;
    private List<PartidoResumenDTO> partidosVisitante;
    private List<FichajeDTO> fichajes;

    protected EquipoDetalleDTO() {

    }

    public EquipoDetalleDTO(Long id, String nombre, LocalDate fechaFundacion, String ciudad, double presupuesto,
            EntrenadorResumenDTO entrenador, List<JugadorResumenDTO> jugadores,
            EstadioResumenDTO estadio, LigaResumenDTO liga, List<PartidoResumenDTO> partidosLocal,
            List<PartidoResumenDTO> partidosVisitante, List<FichajeDTO> fichajes) {
        this.id = id;
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
        this.entrenador = entrenador;
        this.Jugadores = jugadores;
        this.estadio = estadio;
        this.liga = liga;
        this.partidosLocal = partidosLocal;
        this.partidosVisitante = partidosVisitante;
        this.fichajes = fichajes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public EntrenadorResumenDTO getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(EntrenadorResumenDTO entrenador) {
        this.entrenador = entrenador;
    }

    public List<JugadorResumenDTO> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<JugadorResumenDTO> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public EstadioResumenDTO getEstadio() {
        return estadio;
    }

    public void setEstadio(EstadioResumenDTO estadio) {
        this.estadio = estadio;
    }

    public LigaResumenDTO getLiga() {
        return liga;
    }

    public void setLiga(LigaResumenDTO liga) {
        this.liga = liga;
    }

    public List<PartidoResumenDTO> getPartidosLocal() {
        return partidosLocal;
    }

    public void setPartidosLocal(List<PartidoResumenDTO> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }

    public List<PartidoResumenDTO> getPartidosVisitante() {
        return partidosVisitante;
    }

    public void setPartidosVisitante(List<PartidoResumenDTO> partidosVisitante) {
        this.partidosVisitante = partidosVisitante;
    }

    public List<FichajeDTO> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<FichajeDTO> fichajes) {
        this.fichajes = fichajes;
    }

}
