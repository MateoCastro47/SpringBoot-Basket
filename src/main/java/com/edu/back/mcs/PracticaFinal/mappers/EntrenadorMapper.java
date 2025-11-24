package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorResumenDTO;
import com.edu.back.mcs.PracticaFinal.model.Entrenador;

@Mapper(componentModel = "spring")
public interface EntrenadorMapper {
    
    //Mapear entrenador_id (Entity) → id (DTO)
    @Mapping(source = "entrenador_id", target="id")
    @Mapping(target = "equiposEntrenados", ignore = true)
    EntrenadorResumenDTO toResumenDTO(Entrenador entrenador);
    
    List<EntrenadorResumenDTO> toResumenDTOList(List<Entrenador> entrenadores);
}

