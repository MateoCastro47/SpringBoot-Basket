package com.edu.back.mcs.PracticaFinal.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.edu.back.mcs.PracticaFinal.Services.IEstadisticasJugadorService;
import com.edu.back.mcs.PracticaFinal.mappers.EstadisticasJugadorMapper;
import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadisticasJugadorDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/estadisticas")
public class EstadisticasController {
    
    public final EstadisticasJugadorMapper estadisticasJugadorMapper;
    public final IEstadisticasJugadorService estadisticasJugadorService;


    public EstadisticasController(EstadisticasJugadorMapper estadisticasJugadorMapper,IEstadisticasJugadorService estadisticasJugadorService) {
        this.estadisticasJugadorMapper = estadisticasJugadorMapper;
        this.estadisticasJugadorService = estadisticasJugadorService;
    }

    @GetMapping
    public List<EstadisticasJugadorDTO> getAll(){
        return estadisticasJugadorService.obtenerTodasLasEstadisticas().stream().map(estadisticasJugadorMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadisticasJugadorDTO> getById(@PathVariable Long id){
        return estadisticasJugadorService.obtenerEstadisticasPorId(id).map(estadisticasJugadorMapper::toDTO)
        .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<EstadisticasJugadorDTO> create(@RequestBody EstadisticasJugadorDTO estadisticasJugadorDTO, UriComponentsBuilder ucb){

        EstadisticasJugador estadisticasNuevas = estadisticasJugadorService.crearEstadisticas(estadisticasJugadorDTO);
        EstadisticasJugadorDTO estadisticasNuevasDTO = estadisticasJugadorMapper.toDTO(estadisticasNuevas);

        URI location = ucb.path("/api/estadisticas/{id}").buildAndExpand(estadisticasNuevas.getEstadisticas_id()).toUri();

        return ResponseEntity.created(location).body(estadisticasNuevasDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstadisticasJugadorDTO> update(@PathVariable Long id, @RequestBody EstadisticasJugadorDTO estadisticasJugadorDTO){

        EstadisticasJugador estadisticasActualizadas = estadisticasJugadorService.actualizarEstadisticas(id, estadisticasJugadorDTO);
        return ResponseEntity.ok(estadisticasJugadorMapper.toDTO(estadisticasActualizadas));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        estadisticasJugadorService.borrarEstadisticas(id);
    }
}