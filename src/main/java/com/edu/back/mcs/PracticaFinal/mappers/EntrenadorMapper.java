package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorDetalleDTO;
import com.edu.back.mcs.PracticaFinal.model.Entrenador;

@Mapper(componentModel = "spring")
public interface EntrenadorMapper {
    EntrenadorDetalleDTO tDTO(Entrenador entrenador);

    Entrenador toEntity(EntrenadorDetalleDTO dto);

    List<EntrenadorDetalleDTO> toDTOlist(List<Entrenador> entrenadores);

   
    void updateEntityFromDTO(EntrenadorDetalleDTO dto, @MappingTarget Entrenador entrenador);
}

