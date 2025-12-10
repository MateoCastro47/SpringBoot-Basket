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

import com.edu.back.mcs.PracticaFinal.Services.IFichajeService;
import com.edu.back.mcs.PracticaFinal.mappers.FichajeMapper;
import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.DTO.FichajeDTO;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/fichajes")
public class FichajeController {

    private final FichajeMapper fichajeMapper;
    private final IFichajeService fichajeService;

    public FichajeController(FichajeMapper fichajeMapper, IFichajeService fichajeService) {
        this.fichajeMapper = fichajeMapper;
        this.fichajeService = fichajeService;
    }

    @GetMapping
    public List<FichajeDTO> getAll() {
        return fichajeService.obtenerTodosLosFichajes().stream().map(fichajeMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FichajeDTO> getById(@PathVariable Long id) {
        return fichajeService.obtenerFichajePorId(id).map(fichajeMapper::toDTO)
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FichajeDTO> create(@RequestBody FichajeDTO fichajeDTO, UriComponentsBuilder ucb) {

        Fichaje fichajeNuevo = fichajeService.crearFichaje(fichajeDTO);
        FichajeDTO fichajeNuevoDTO = fichajeMapper.toDTO(fichajeNuevo);

        URI location = ucb.path("/api/fichajes/{id}").buildAndExpand(fichajeNuevo.getFichaje_id()).toUri();
        return ResponseEntity.created(location).body(fichajeNuevoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FichajeDTO> update(@PathVariable Long id, @RequestBody FichajeDTO fichajeDTO) {

        Fichaje fichajeActualizado = fichajeService.actualizarFichaje(id, fichajeDTO);
        return ResponseEntity.ok(fichajeMapper.toDTO(fichajeActualizado));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        fichajeService.borrarFichaje(id);
    }
}
