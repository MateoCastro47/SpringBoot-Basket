package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadisticasJugadorDTO;

@Mapper(componentModel = "spring")
public interface EstadisticasJugadorMapper {

    EstadisticasJugadorDTO toDTO(EstadisticasJugador estadisticas);

    EstadisticasJugador toEntity(EstadisticasJugadorDTO dto);

    List<EstadisticasJugadorDTO> toDTOList(List<EstadisticasJugador> estadisticas);

    void updateEntityFromDTO(EstadisticasJugadorDTO dto, @MappingTarget EstadisticasJugador estadisticas);
}
