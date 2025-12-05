package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Estadio;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioResumenDTO;

@Mapper(componentModel = "spring")
public interface EstadioResumenMapper {
    
    EstadioResumenDTO toDTO(Estadio estadio);
    Estadio toEntity(EstadioResumenDTO dto);

}
