package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoResumenDTO;

@Mapper(componentModel="spring")
public interface PartidoMapper {
    
    // Ignorar campos que necesitan mapeo personalizado
    @Mapping(target = "equipoLocalNombre", ignore = true)
    @Mapping(target = "equipoVisitanteNombre", ignore = true)
    PartidoResumenDTO toResumenDTO(Partido partido);
    
    List<PartidoResumenDTO> toResumenDTOList(List<Partido> partidos);
}
