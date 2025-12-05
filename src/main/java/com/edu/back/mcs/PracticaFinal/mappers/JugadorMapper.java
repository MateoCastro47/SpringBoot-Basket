package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import com.edu.back.mcs.PracticaFinal.model.Jugador;
import com.edu.back.mcs.PracticaFinal.model.DTO.JugadorDetalleDTO;

@Mapper(componentModel = "spring", uses = { EquipoResumenDTOMapper.class, EstadisticasJugadorMapper.class,
        FichajeMapper.class })
public interface JugadorMapper {

    @Mapping(source = "equipo", target = "equipoResumenDTO")
    @Mapping(source = "estadisticas", target = "estadisticasJugador")
    @Mapping(source = "fichajes", target = "fichajes")
    JugadorDetalleDTO tDTO(Jugador jugador);

    @Mapping(source = "equipoResumenDTO", target = "equipo")
    @Mapping(source = "estadisticasJugador", target = "estadisticas")
    @Mapping(source = "fichajes", target = "fichajes")
    Jugador toEntity(JugadorDetalleDTO dto);

    List<JugadorDetalleDTO> toDTOlist(List<Jugador> jugadores);

    @Mapping(source = "equipoResumenDTO", target = "equipo")
    @Mapping(source = "estadisticasJugador", target = "estadisticas")
    @Mapping(source = "fichajes", target = "fichajes")
    void updateEntityFromDTO(JugadorDetalleDTO dto, @MappingTarget Jugador jugador);

}
