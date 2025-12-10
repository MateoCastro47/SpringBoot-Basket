package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoDetalleDTO;

@Mapper(componentModel = "spring", uses = {
        EntrenadorResumenMapper.class,
        JugadorResumenMapper.class,
        EstadioResumenMapper.class,
        LigaResumenMapper.class,
        PartidoResumenMapper.class,
        FichajeMapper.class
})
public interface EquipoMapper { 

    @Mapping(source = "jugadores", target = "jugadores")
    EquipoDetalleDTO toDTO(Equipo equipo);

    @Mapping(source = "jugadores", target = "jugadores")
    Equipo toEntity(EquipoDetalleDTO dto);

    List<EquipoDetalleDTO> toDTOList(List<Equipo> equipos);

    @Mapping(source = "jugadores", target = "jugadores")
    void updateEntityFromDTO(EquipoDetalleDTO dto, @MappingTarget Equipo equipo);
}
