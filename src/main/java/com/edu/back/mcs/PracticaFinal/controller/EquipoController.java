package com.edu.back.mcs.PracticaFinal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.edu.back.mcs.PracticaFinal.Services.IEquipoService;
import com.edu.back.mcs.PracticaFinal.mappers.EquipoMapper;
import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoDetalleDTO;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    private final EquipoMapper equipoMapper;
    private final IEquipoService equipoService;

    public EquipoController(EquipoMapper equipoMapper, IEquipoService equipoService) {
        this.equipoMapper = equipoMapper;
        this.equipoService = equipoService;
    }

    @GetMapping
    public List<EquipoDetalleDTO> getAll() {
        return equipoService.obtenerTodosLosEquipos().stream().map(equipoMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipoDetalleDTO> getById(@PathVariable Long id) {
        return equipoService.obtenerEquipoPorId(id).map(equipoMapper::toDTO)
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar")
    public ResponseEntity<EquipoDetalleDTO> buscarEquipo(@RequestParam String nombre, @RequestParam Long ligaId) {
        return equipoService.buscarEquipoPorNombreyLiga(nombre, ligaId)
                .map(equipoMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EquipoDetalleDTO> create(@RequestBody EquipoDetalleDTO equipoDetalleDTO,
            UriComponentsBuilder ucb) {

        Equipo equipoNuevo = equipoService.crearEquipo(equipoDetalleDTO);
        EquipoDetalleDTO nuevoequipoDTO = equipoMapper.toDTO(equipoNuevo);

        URI location = ucb.path("/api/equipos/{id}").buildAndExpand(equipoNuevo.getId()).toUri();

        return ResponseEntity.created(location).body(nuevoequipoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipoDetalleDTO> update(@PathVariable Long id,
            @RequestBody EquipoDetalleDTO equipoDetalleDTO) {

        Equipo equipoActualizado = equipoService.actualizarEquipo(id, equipoDetalleDTO);
        return ResponseEntity.ok(equipoMapper.toDTO(equipoActualizado));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        equipoService.borrarEquipo(id);
    }
}
