package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.ILigaService;
import com.edu.back.mcs.PracticaFinal.mappers.LigaMapper;
import com.edu.back.mcs.PracticaFinal.model.Liga;
import com.edu.back.mcs.PracticaFinal.model.DTO.LigaDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.LigaRepository;

@Service
public class LigaServiceimpl implements ILigaService {

    public final LigaRepository ligaRepository;
    public final LigaMapper ligaMapper;

    public LigaServiceimpl(LigaRepository ligaRepository, LigaMapper ligaMapper) {
        this.ligaRepository = ligaRepository;
        this.ligaMapper = ligaMapper;
    }

    @Override
    @Transactional
    public Liga actualizarLiga(Long id, LigaDetalleDTO dto) {
        try {
            Liga ligaExistente = ligaRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Liga no encontrada con el id: " + id));

            ligaMapper.updateEntityFromDTO(dto, ligaExistente);

            Optional<Liga> otraLigaConElMismoNombre = ligaRepository.findByNombreAndPais(ligaExistente.getNombre(),
                    ligaExistente.getPais());
            if (otraLigaConElMismoNombre.isPresent() && !otraLigaConElMismoNombre.get().getLiga_id().equals(id)) {
                throw new IllegalArgumentException("Ya existe una liga con el nombre: " + ligaExistente.getNombre()
                        + " en " + ligaExistente.getPais());
            }
            return ligaRepository.save(ligaExistente);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos de liga inválidos " + e.getMessage());
        }
    }

    @Override
    @Transactional
    public void borrarLiga(Long id) {
        if (ligaRepository.existsById(id)) {
            ligaRepository.deleteById(id);
        }

    }

    @Override
    public Liga crearLiga(LigaDetalleDTO dto) {
        Liga liga = ligaMapper.toEntity(dto);

        // Validar que no exista una liga con el mismo nombre en el mismo país
        if (ligaRepository.existsByNombreAndPais(liga.getNombre(), liga.getPais())) {
            throw new IllegalArgumentException(
                    "Ya existe una liga con el nombre " + liga.getNombre() + " en " + liga.getPais());
        }
        return ligaRepository.save(liga);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Liga> obtenerLigaPorId(Long id) {
        return ligaRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Liga> obtenerTodasLasLigas() {
        return ligaRepository.findAll();
    }

}
