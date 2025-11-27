package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.edu.back.mcs.PracticaFinal.model.Partido;
import com.edu.back.mcs.PracticaFinal.model.DTO.PartidoDetalleDTO;

@Mapper(componentModel="spring")
public interface PartidoMapper {
    
    PartidoDetalleDTO toDTO(Partido partido);

    Partido toEntity(PartidoDetalleDTO dto);

    List<PartidoDetalleDTO> toDTOlist(List<PartidoDetalleDTO> partidos);

    void updateEntityFromDTO(PartidoDetalleDTO dto, @MappingTarget Partido partido); 
}
