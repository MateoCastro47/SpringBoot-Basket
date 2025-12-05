package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorResumenDTO;

@Mapper(componentModel = "spring")
public interface JugadorResumenMapper {

    JugadorResumenDTO toDTO(Jugador jugador);

    Jugador toEntity(JugadorResumenDTO dto);
}
