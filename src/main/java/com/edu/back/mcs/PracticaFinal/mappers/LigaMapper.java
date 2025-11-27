package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.DTO.LigaDetalleDTO;
import com.edu.back.mcs.PracticaFinal.model.Liga;

@Mapper(componentModel = "spring")
public interface LigaMapper {
    
    LigaDetalleDTO toDTO(Liga liga);

    Liga toEntity(LigaDetalleDTO dto);

    List<LigaDetalleDTO> toDTOlist(List<Liga> ligas);

    void updateEntityFromDTO(LigaDetalleDTO dto, @MappingTarget Liga liga);
}
