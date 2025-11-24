package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.DTO.LigaResumenDTO;
import com.edu.back.mcs.PracticaFinal.model.Liga;

@Mapper(componentModel = "spring")
public interface LigaMapper {
    
    LigaResumenDTO toResumenDTO(Liga liga);
    
    List<LigaResumenDTO> toResumenDTOList(List<Liga> ligas);
}
