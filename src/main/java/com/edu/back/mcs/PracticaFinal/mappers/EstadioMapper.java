package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioDetalleDTO;
import com.edu.back.mcs.PracticaFinal.model.Estadio;

@Mapper(componentModel = "spring")
public interface EstadioMapper {
    
    EstadioDetalleDTO toDTO(Estadio estadio);

    Estadio toEntity(EstadioDetalleDTO dto);

    List<EstadioDetalleDTO> toDTOlist(List<EstadioDetalleDTO> estadios);

    void updateEntityFromDTO(EstadioDetalleDTO dto, @MappingTarget Estadio estadio);
}
