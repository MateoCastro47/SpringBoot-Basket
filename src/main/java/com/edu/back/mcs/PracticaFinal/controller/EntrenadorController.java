package com.edu.back.mcs.PracticaFinal.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.edu.back.mcs.PracticaFinal.Services.IEntrenadorService;
import com.edu.back.mcs.PracticaFinal.mappers.EntrenadorMapper;
import com.edu.back.mcs.PracticaFinal.model.Entrenador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorDetalleDTO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api/entrenadores")
public class EntrenadorController {
    
    private final EntrenadorMapper entrenadorMapper;
    private final IEntrenadorService entrenadorService;


    public EntrenadorController(EntrenadorMapper entrenadorMapper, IEntrenadorService entrenadorService) {
        this.entrenadorMapper = entrenadorMapper;
        this.entrenadorService = entrenadorService;
    }

    @GetMapping 
    public List<EntrenadorDetalleDTO> getAll(){
        return entrenadorService.obtenerTodosLosEntrenadores().stream().map(entrenadorMapper::tDTO).collect(Collectors.toList());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<EntrenadorDetalleDTO> getById(@PathVariable Long id){
        return entrenadorService.obtenerEntreandorPorId(id).map(entrenadorMapper::tDTO)
        .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<EntrenadorDetalleDTO> create(@RequestBody EntrenadorDetalleDTO entrenadorDetalleDTO,
        UriComponentsBuilder ucb){

            Entrenador entrenadorNuevo = entrenadorService.crearEntrenador(entrenadorDetalleDTO);
            EntrenadorDetalleDTO entrenadorNuevoDTO = entrenadorMapper.tDTO(entrenadorNuevo);

            URI location = ucb.path("/api/entrenadores/{id}").buildAndExpand(entrenadorNuevo.getEntrenador_id()).toUri();

            return ResponseEntity.created(location).body(entrenadorNuevoDTO);
        }
    
    @PutMapping("/{id}")
    public ResponseEntity<EntrenadorDetalleDTO> update(@PathVariable Long id, 
        @RequestBody EntrenadorDetalleDTO entrenadorDetalleDTO){

            Entrenador entrenadorActualizado = entrenadorService.actualizarEntrenador(id, entrenadorDetalleDTO);
            return ResponseEntity.ok(entrenadorMapper.tDTO(entrenadorActualizado));
        }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        entrenadorService.borrarEntrenador(id);
    }
}
