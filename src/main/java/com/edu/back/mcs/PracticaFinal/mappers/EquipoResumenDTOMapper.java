package com.edu.back.mcs.PracticaFinal.mappers;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoResumenDTO;

@Mapper(componentModel = "spring")
public interface EquipoResumenDTOMapper {
  
    EquipoResumenDTO toDTO(Equipo equipo);

    Equipo toEntity(EquipoResumenDTO dto);
    
}
