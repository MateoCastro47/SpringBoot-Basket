package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoDetalleDTO;

@Mapper(componentModel = "spring", uses={JugadorMapper.class})
public interface EquipoMapper {
    EquipoDetalleDTO toDTO(Equipo equipo);

    Equipo toEntity(EquipoDetalleDTO dto);

    List<EquipoDetalleDTO> toDTOList(List<Equipo> equipos);

    void updateEntityFromDTO(EquipoDetalleDTO dto, @MappingTarget Equipo equipo);
}
