package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IEntrenadorService;
import com.edu.back.mcs.PracticaFinal.mappers.EntrenadorMapper;
import com.edu.back.mcs.PracticaFinal.model.Entrenador;
import com.edu.back.mcs.PracticaFinal.model.DTO.EntrenadorDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.EntrenadorRepository;

@Service
public class EntrenadorServiceimpl implements IEntrenadorService{
    
    private final EntrenadorRepository entrenadorRepository;
    private final EntrenadorMapper entrenadorMapper;

    
    public EntrenadorServiceimpl(EntrenadorRepository entrenadorRepository, EntrenadorMapper entrenadorMapper) {
        this.entrenadorRepository = entrenadorRepository;
        this.entrenadorMapper = entrenadorMapper;
    }


    @Override
    @Transactional
    public Entrenador actualizarEntrenador(Long id, EntrenadorDetalleDTO dto) {
       try{
        Entrenador entrenadorExistente = entrenadorRepository.findById(id)
        .orElseThrow( () -> new RuntimeException("Entrenador no encontrado con id: " + dto.getId()));

        entrenadorMapper.updateEntityFromDTO(dto, entrenadorExistente);

        return entrenadorRepository.save(entrenadorExistente);
       }catch(IllegalArgumentException e){
        throw new RuntimeException("Datos del entrenador invalidos");
       }
    }


    @Override
    @Transactional
    public void borrarEntrenador(Long id) {
        if (entrenadorRepository.existsById(id)) {
            entrenadorRepository.deleteById(id);
        }else{
            throw new RuntimeException("Entrenador no encontrado con el id: " + id);
        }
    }


    @Override
    @Transactional
    public Entrenador crearEntrenador(EntrenadorDetalleDTO dto) {
        Entrenador entrenador = entrenadorMapper.toEntity(dto);

        if(entrenadorRepository.existsByNombreAndApellido(entrenador.getNombre(), entrenador.getApellido())){
            throw new IllegalArgumentException("Ya existe un entrenador con el nombre: " + dto.getNombre() + "" + dto.getApellido());
        }
        return entrenadorRepository.save(entrenador);

    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Entrenador> obtenerEntreandorPorId(Long id) {
        return entrenadorRepository.findById(id);
    }


    @Override
    public List<Entrenador> obtenerTodosLosEntrenadores() {
        return entrenadorRepository.findAll();
    }

    
}
