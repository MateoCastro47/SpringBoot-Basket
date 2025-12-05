package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Entrenador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorResumenDTO;

@Mapper(componentModel = "spring")
public interface EntrenadorResumenMapper {
    
    EntrenadorResumenDTO toDTO(Entrenador entrenador);
    Entrenador toEntity(EntrenadorResumenDTO dto);
}
