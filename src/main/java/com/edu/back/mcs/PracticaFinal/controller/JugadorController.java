package com.edu.back.mcs.PracticaFinal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.edu.back.mcs.PracticaFinal.Services.IJugadorService;
import com.edu.back.mcs.PracticaFinal.mappers.JugadorMapper;
import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

    private final JugadorMapper jugadorMapper;
    private final IJugadorService jugadorService;

    public JugadorController(JugadorMapper jugadorMapper, IJugadorService jugadorService) {
        this.jugadorMapper = jugadorMapper;
        this.jugadorService = jugadorService;
    }

    @GetMapping
    public List<JugadorDetalleDTO> getAll() {
        return jugadorService.obtenerTodosLosJugadores().stream().map(jugadorMapper::tDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JugadorDetalleDTO> getbyId(@PathVariable Long id) {
        return jugadorService.obtenerjugadorPorId(id).map(jugadorMapper::tDTO)
                .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<JugadorDetalleDTO> create(@RequestBody JugadorDetalleDTO jugadorDetalleDTO,
            UriComponentsBuilder ucb) {

        Jugador jugadorNuevo = jugadorService.crearJugador(jugadorDetalleDTO);
        JugadorDetalleDTO jugadorNuevoDTO = jugadorMapper.tDTO(jugadorNuevo);

        URI location = ucb.path("/api/jugadores/{id}").buildAndExpand(jugadorNuevo.getId()).toUri();

        return ResponseEntity.created(location).body(jugadorNuevoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JugadorDetalleDTO> update(@PathVariable Long id,
            @RequestBody JugadorDetalleDTO jugadorDetalleDTO) {

        Jugador jugadorActualizado = jugadorService.actualizarJugador(id, jugadorDetalleDTO);
        return ResponseEntity.ok(jugadorMapper.tDTO(jugadorActualizado));

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        jugadorService.borrarJugador(id);
    }
}