package com.edu.back.mcs.PracticaFinal.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.edu.back.mcs.PracticaFinal.Services.ILigaService;
import com.edu.back.mcs.PracticaFinal.mappers.LigaMapper;
import com.edu.back.mcs.PracticaFinal.model.Liga;
import com.edu.back.mcs.PracticaFinal.model.DTO.LigaDetalleDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/ligas")
public class LigaController {
    
    private final LigaMapper ligaMapper;
    private final ILigaService ligaService;


    public LigaController(LigaMapper ligaMapper, ILigaService ligaService) {
        this.ligaMapper = ligaMapper;
        this.ligaService = ligaService;
    }
    
    @GetMapping
    public List<LigaDetalleDTO> getAll(){
        return ligaService.obtenerTodasLasLigas().stream().map(ligaMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LigaDetalleDTO> getById(@RequestParam Long id){
        return ligaService.obtenerLigaPorId(id).map(ligaMapper::toDTO)
        .map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<LigaDetalleDTO> create(@RequestBody LigaDetalleDTO ligaDetalleDTO, UriComponentsBuilder ucb){

        Liga ligaNueva = ligaService.crearLiga(ligaDetalleDTO);
        LigaDetalleDTO ligaNuevaDTO = ligaMapper.toDTO(ligaNueva);

        URI location = ucb.path("/api/ligas/{id}").buildAndExpand(ligaNueva.getLiga_id()).toUri();
        return ResponseEntity.created(location).body(ligaNuevaDTO);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<LigaDetalleDTO> update(@PathVariable Long id, @RequestBody LigaDetalleDTO ligaDetalleDTO){

        Liga ligaActualizada = ligaService.actualizarLiga(id, ligaDetalleDTO);
        return ResponseEntity.ok(ligaMapper.toDTO(ligaActualizada));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        ligaService.borrarLiga(id);
    }
}
