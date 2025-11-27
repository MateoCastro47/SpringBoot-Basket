package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.DTO.FichajeDTO;

@Mapper(componentModel = "spring")
public interface FichajeMapper {

    FichajeDTO toDTO(Fichaje fichaje);

    Fichaje toEntity(FichajeDTO dto);

    List<FichajeDTO> toDTOList(List<Fichaje> fichajes);

    void updateEntityFromDTO(FichajeDTO dto, @MappingTarget Fichaje fichaje);
}
