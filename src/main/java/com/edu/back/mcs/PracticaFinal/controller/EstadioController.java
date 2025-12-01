package com.edu.back.mcs.PracticaFinal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.edu.back.mcs.PracticaFinal.Services.IEstadioService;
import com.edu.back.mcs.PracticaFinal.mappers.EstadioMapper;
import com.edu.back.mcs.PracticaFinal.model.Estadio;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioDetalleDTO;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/estadios")
public class EstadioController {
    
    private final EstadioMapper estadioMapper;
    private final IEstadioService estadioService;


    public EstadioController(EstadioMapper estadioMapper, IEstadioService estadioService) {
        this.estadioMapper = estadioMapper;
        this.estadioService = estadioService;
    }

    @GetMapping
    public List<EstadioDetalleDTO> getAll(){
        return estadioService.obtenerTodosLosEstadios().stream().map(estadioMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadioDetalleDTO> getById(@PathVariable Long id){

        return estadioService.obtenerEstadioPorId(id).map(estadioMapper::toDTO)
        .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }    

    @PostMapping
    public ResponseEntity<EstadioDetalleDTO> create(@RequestBody EstadioDetalleDTO estadioDetalleDTO,
        UriComponentsBuilder ucb){

            Estadio estadioNuevo = estadioService.crearEstadio(estadioDetalleDTO);
            EstadioDetalleDTO estadioNuevoDTO = estadioMapper.toDTO(estadioNuevo);

            URI location = ucb.path("/api/estadios/{id}").buildAndExpand(estadioNuevo.getEstadio_id()).toUri();

            return ResponseEntity.created(location).body(estadioNuevoDTO);
        }

    @PutMapping("/{id}")
    public ResponseEntity<EstadioDetalleDTO> update(@PathVariable Long id,
        @RequestBody EstadioDetalleDTO estadioDetalleDTO){

        Estadio estadioActualizado = estadioService.actualizarEstadio(id, estadioDetalleDTO);
        return ResponseEntity.ok(estadioMapper.toDTO(estadioActualizado));

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        estadioService.borrarEstadio(id);
    }
    
}
