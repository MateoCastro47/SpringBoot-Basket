package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IEstadioService;
import com.edu.back.mcs.PracticaFinal.mappers.EstadioMapper;
import com.edu.back.mcs.PracticaFinal.model.Estadio;
import com.edu.back.mcs.PracticaFinal.model.DTO.EstadioDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.EstadioRepository;

@Service
public class EstadioServiceimpl implements IEstadioService{
    
    public final EstadioRepository estadioRepository;
    public final EstadioMapper estadioMapper;


    public EstadioServiceimpl(EstadioRepository estadioRepository, EstadioMapper estadioMapper) {
        this.estadioRepository = estadioRepository;
        this.estadioMapper = estadioMapper;
    }


    @Override
    @Transactional
    public Estadio actualizarEstadio(Long id, EstadioDetalleDTO dto) {
        try{
            Estadio estadioExistente = estadioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Estadio no encontrado con id: " + id));

            estadioMapper.updateEntityFromDTO(dto, estadioExistente);

            //Validacion 1: Nombre único por ciudad
            Optional<Estadio> otroEstadioConElMismoNombre = estadioRepository.findByNombreAndCiudad(estadioExistente.getNombre(), estadioExistente.getCiudad());
            if (otroEstadioConElMismoNombre.isPresent() && !otroEstadioConElMismoNombre.get().getEstadio_id().equals(id)) {
                throw new IllegalArgumentException("Ya existe otro estadio con el nombre " + estadioExistente.getNombre() + " en " + estadioExistente.getCiudad());
            }

            if (estadioExistente.getCapacidad() <= 0) {
                throw new RuntimeException("La capacidad del estadio debe ser positiva y mayor que 0");
            }
            return estadioRepository.save(estadioExistente);
        }catch(IllegalArgumentException e){
            throw new RuntimeException("Datos de estadio inválidos " + e.getMessage());
        }
    }


    @Override
    @Transactional
    public void borrarEstadio(Long id) {
        if (estadioRepository.existsById(id)) {
            estadioRepository.deleteById(id);
        }
    }


    @Override
    @Transactional
    public Estadio crearEstadio(EstadioDetalleDTO dto) {
        
        Estadio estadio = estadioMapper.toEntity(dto);

        //Validacion 1: Nombre único por ciudad
        if (estadioRepository.existsByNombreAndCiudad(estadio.getNombre(), estadio.getCiudad())) {
            throw new IllegalArgumentException("Ya existe un estadio con nombre: " + estadio.getNombre() + " en " + estadio.getCiudad());
        }

        //Validación 2: Capacidad positiva 
        if (estadio.getCapacidad() <= 0) {
            throw new IllegalArgumentException("La capacidad del estadio debe ser mayor que 0");
        }
        return estadioRepository.save(estadio);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Estadio> obtenerEstadioPorId(Long id) {
        return estadioRepository.findById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Estadio> obtenerTodosLosEstadios() {
        return estadioRepository.findAll();
    }

    
    
}
