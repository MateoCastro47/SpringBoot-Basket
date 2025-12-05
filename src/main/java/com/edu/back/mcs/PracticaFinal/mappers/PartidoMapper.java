package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoDetalleDTO;

@Mapper(componentModel = "spring", uses = { EquipoResumenDTOMapper.class, EstadioResumenMapper.class,
        EstadisticasJugadorMapper.class })
public interface PartidoMapper {

    @Mapping(source = "equipoLocal.nombre", target = "equipoLocalNombre")
    @Mapping(source = "equipoVisitante.nombre", target = "equipoVisitanteNombre")
    @Mapping(source = "estadio.nombre", target = "estadioNombre")
    @Mapping(source = "estadisticas", target = "estadisticas")
    PartidoDetalleDTO toDTO(Partido partido);

    @Mapping(target = "equipoLocal", ignore = true)
    @Mapping(target = "equipoVisitante", ignore = true)
    @Mapping(target = "estadio", ignore = true)
    @Mapping(target = "estadisticas", ignore = true)
    Partido toEntity(PartidoDetalleDTO dto);

    List<PartidoDetalleDTO> toDTOlist(List<Partido> partidos);

    @Mapping(target = "equipoLocal", ignore = true)
    @Mapping(target = "equipoVisitante", ignore = true)
    @Mapping(target = "estadio", ignore = true)
    @Mapping(target = "estadisticas", ignore = true)
    void updateEntityFromDTO(PartidoDetalleDTO dto, @MappingTarget Partido partido);
}
