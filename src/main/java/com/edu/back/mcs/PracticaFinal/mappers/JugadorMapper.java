package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;

@Mapper(componentModel = "spring")
public interface JugadorMapper {

    JugadorDetalleDTO tDTO(Jugador jugador);

    Jugador toEntity(JugadorDetalleDTO dto);

    List<JugadorDetalleDTO> toDTOlist(List<Jugador> jugadores);

   
    void updateEntityFromDTO(JugadorDetalleDTO dto, @MappingTarget Jugador jugador); 

}
