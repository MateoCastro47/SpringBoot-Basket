package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorResumenDTO;

@Mapper(componentModel= "spring")
public interface JugadorMapper {
    @Mapping(target = "equipoResumenDTO", ignore = true)
    @Mapping(target = "estadisticas", ignore = true)
    @Mapping(target = "fichajes", ignore = true)
    JugadorDetalleDTO toDetalleDTO(Jugador jugador);

    JugadorResumenDTO toResumenDTO(Jugador jugador);

    List<JugadorResumenDTO> toResumenDTOList(List<Jugador> jugadores);
}
