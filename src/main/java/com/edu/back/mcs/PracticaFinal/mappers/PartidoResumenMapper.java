package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoResumenDTO;

@Mapper(componentModel = "spring")
public interface PartidoResumenMapper {

    PartidoResumenDTO toDTO(Partido partido);

    Partido toEntity(PartidoResumenDTO dto);
}
