package com.edu.back.mcs.PracticaFinal.model.DTO;

import java.time.LocalDate;
import java.util.List;

import com.edu.back.mcs.PracticaFinal.model.Estadio;
import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.Liga;
import com.edu.back.mcs.PracticaFinal.model.Partido;
public class EquipoDetalleDTO {
    private Long id;
    private String nombre;
    private LocalDate fechaFundacion;
    private String ciudad;
    private double presupuesto;
    private EntrenadorResumenDTO entrenador;
    private List<JugadorResumenDTO> Jugadores;
    private Estadio estadio;
    private Liga liga;
    private List<Partido> partidosLocal;
    private List<Partido> partidosVisitante;
    private List<Fichaje> fichajes;

    protected EquipoDetalleDTO(){
        
    }

    public EquipoDetalleDTO(Long id, String nombre, LocalDate fechaFundacion, String ciudad, double presupuesto, EntrenadorResumenDTO entrenador, List<JugadorResumenDTO> jugadores,
        Estadio estadio, Liga liga, List<Partido> partidosLocal, List<Partido> partidosVisitante, List<Fichaje> fichajes){
            this.id = id;
            this.nombre = nombre;
            this.fechaFundacion = fechaFundacion;
            this.ciudad = ciudad;
            this.presupuesto = presupuesto;
            this.entrenador = entrenador;
            this.Jugadores = jugadores;
            this.estadio= estadio;
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

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public List<Partido> getPartidosLocal() {
        return partidosLocal;
    }

    public void setPartidosLocal(List<Partido> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }

    public List<Partido> getPartidosVisitante() {
        return partidosVisitante;
    }

    public void setPartidosVisitante(List<Partido> partidosVisitante) {
        this.partidosVisitante = partidosVisitante;
    }

    public List<Fichaje> getFichajes() {
        return fichajes;
    }

    public void setFichajes(List<Fichaje> fichajes) {
        this.fichajes = fichajes;
    }


    

}

