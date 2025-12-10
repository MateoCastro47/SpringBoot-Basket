package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.EstadisticasJugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadisticasJugadorDTO;

@Mapper(componentModel = "spring")
public interface EstadisticasJugadorMapper {

    @Mapping(source = "jugador.nombre", target = "jugadorNombre")
    @Mapping(source = "partido.partido_id", target = "partidoId")
    EstadisticasJugadorDTO toDTO(EstadisticasJugador estadisticas);

    @Mapping(target = "jugador", ignore = true)
    @Mapping(target = "partido", ignore = true)
    EstadisticasJugador toEntity(EstadisticasJugadorDTO dto);

    List<EstadisticasJugadorDTO> toDTOList(List<EstadisticasJugador> estadisticas);

    @Mapping(target = "jugador", ignore = true)
    @Mapping(target = "partido", ignore = true)
    void updateEntityFromDTO(EstadisticasJugadorDTO dto, @MappingTarget EstadisticasJugador estadisticas);
}
