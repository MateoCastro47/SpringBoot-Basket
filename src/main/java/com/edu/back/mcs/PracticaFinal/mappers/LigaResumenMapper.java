package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Liga;
import com.edu.back.mcs.PracticaFinal.model.DTO.LigaResumenDTO;

@Mapper(componentModel = "spring")
public interface LigaResumenMapper {
    LigaResumenDTO toDTO(Liga liga);
    Liga toEntity(LigaResumenDTO dto);
}