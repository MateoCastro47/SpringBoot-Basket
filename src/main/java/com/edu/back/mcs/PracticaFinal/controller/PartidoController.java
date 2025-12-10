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

import com.edu.back.mcs.PracticaFinal.Services.IPartidoService;
import com.edu.back.mcs.PracticaFinal.mappers.PartidoMapper;
import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoDetalleDTO;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/partidos")
public class PartidoController {

    private final PartidoMapper partidoMapper;
    private final IPartidoService partidoService;

    public PartidoController(PartidoMapper partidoMapper, IPartidoService partidoService) {
        this.partidoMapper = partidoMapper;
        this.partidoService = partidoService;
    }

    @GetMapping
    public List<PartidoDetalleDTO> getAll() {
        return partidoService.obtenerTodosLosPartidos().stream().map(partidoMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PartidoDetalleDTO> getById(@PathVariable Long id) {
        return partidoService.obtenerPartidoPorId(id).map(partidoMapper::toDTO)
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar")
    public ResponseEntity<PartidoDetalleDTO> buscarPartido(
            @org.springframework.web.bind.annotation.RequestParam Long local,
            @org.springframework.web.bind.annotation.RequestParam Long visitante,
            @org.springframework.web.bind.annotation.RequestParam java.time.LocalDate fecha) {

        return partidoService.buscarPartido(local, visitante, fecha)
                .map(partidoMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PartidoDetalleDTO> create(@RequestBody PartidoDetalleDTO partidoDetalleDTO,
            UriComponentsBuilder ucb) {

        Partido partidoNuevo = partidoService.crearPartido(partidoDetalleDTO);
        PartidoDetalleDTO partidoNuevoDTO = partidoMapper.toDTO(partidoNuevo);

        URI location = ucb.path("/api/partidos/{id}").buildAndExpand(partidoNuevo.getPartido_id()).toUri();

        return ResponseEntity.created(location).body(partidoNuevoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PartidoDetalleDTO> update(@PathVariable Long id,
            @RequestBody PartidoDetalleDTO partidoDetalleDTO) {

        Partido partidoActualizado = partidoService.actualizarPartido(id, partidoDetalleDTO);
        return ResponseEntity.ok(partidoMapper.toDTO(partidoActualizado));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        partidoService.borrarPartido(id);
    }
}
