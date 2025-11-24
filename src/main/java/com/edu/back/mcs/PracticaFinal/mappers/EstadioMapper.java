package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioResumenDTO;
import com.edu.back.mcs.PracticaFinal.model.Estadio;

@Mapper(componentModel = "spring")
public interface EstadioMapper {
    
    EstadioResumenDTO toResumenDTO(Estadio estadio);

    List<EstadioResumenDTO> toResumenDTOList(List<Estadio> estadios);
}
