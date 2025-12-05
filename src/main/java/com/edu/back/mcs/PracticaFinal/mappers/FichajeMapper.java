package com.edu.back.mcs.PracticaFinal.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.edu.back.mcs.PracticaFinal.model.Fichaje;
import com.edu.back.mcs.PracticaFinal.model.DTO.FichajeDTO;

@Mapper(componentModel = "spring")
public interface FichajeMapper {

    @Mapping(target = "jugadorNombre", ignore = true)
    @Mapping(target = "equipoNombre", ignore = true)
    @Mapping(source = "dinero.cantidad", target = "cantidad")
    @Mapping(source = "dinero.moneda", target = "moneda")
    FichajeDTO toDTO(Fichaje fichaje);

    @Mapping(target = "jugador", ignore = true)
    @Mapping(target = "equipo", ignore = true)
    @Mapping(target = "dinero", expression = "java(new com.edu.back.mcs.PracticaFinal.model.ValueObjects.Dinero(dto.getCantidad(), dto.getMoneda()))")
    Fichaje toEntity(FichajeDTO dto);

    List<FichajeDTO> toDTOList(List<Fichaje> fichajes);

    @Mapping(target = "jugador", ignore = true)
    @Mapping(target = "equipo", ignore = true)
    @Mapping(target = "dinero", expression = "java(new com.edu.back.mcs.PracticaFinal.model.ValueObjects.Dinero(dto.getCantidad(), dto.getMoneda()))")
    void updateEntityFromDTO(FichajeDTO dto, @MappingTarget Fichaje fichaje);
}
