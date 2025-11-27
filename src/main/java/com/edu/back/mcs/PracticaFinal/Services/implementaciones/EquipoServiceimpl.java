package com.edu.back.mcs.PracticaFinal.Services.implementaciones;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.back.mcs.PracticaFinal.Services.IEquipoService;
import com.edu.back.mcs.PracticaFinal.mappers.EquipoMapper;
import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.DTO.EquipoDetalleDTO;
import com.edu.back.mcs.PracticaFinal.repository.EquipoRepository;

@Service
public class EquipoServiceimpl implements IEquipoService {

    private final EquipoRepository equipoRepository;
    private final EquipoMapper equipoMapper;

    public EquipoServiceimpl(EquipoRepository equipoRepository, EquipoMapper equipoMapper) {
        this.equipoRepository = equipoRepository;
        this.equipoMapper = equipoMapper;
    }

    @Override
    public Equipo actualizarEquipo(Long id, EquipoDetalleDTO dto) {

        try {
            Equipo equipoExistente = equipoRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Equipo no encontrado con id " + id));

            equipoMapper.updateEntityFromDTO(dto, equipoExistente);

            //Validar que el entrenador no está en otro equipo
            if (equipoExistente.getEntrenador() != null) {
                Optional<Equipo> otroEquipoConMismoEntrenador = equipoRepository.findByEntrenadorAndIdNot(equipoExistente.getEntrenador(), id);
                if (otroEquipoConMismoEntrenador.isPresent()) {
                    throw new IllegalArgumentException("El entrenador " + equipoExistente.getEntrenador().getNombre() + " " + equipoExistente.getEntrenador().getApellido() + "ya está asignado al equipo " + otroEquipoConMismoEntrenador.get().getNombre());
                }
            }
            return equipoRepository.save(equipoExistente);

        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Datos del equipo invalidos");
        }
    }

    @Override
    @Transactional
    public void borrarEquipo(Long id) {
        if (equipoRepository.existsById(id)) {
            equipoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Equipo no encontrado con id: " + id);
        }
    }

    @Override
    @Transactional
    public Equipo crearEquipo(EquipoDetalleDTO dto) {
        Equipo equipo = equipoMapper.toEntity(dto);

        // Validar nombre de equipo único en liga
        if (equipo.getLiga() != null && equipoRepository
                .findByNombreAndLigaId(equipo.getNombre(), equipo.getLiga().getLiga_id()).isPresent()) {
            throw new IllegalArgumentException(
                    "Ya existe un equipo con el nombre: " + dto.getNombre() + " en esta liga");
        }

        //validar que el entrenador ya no esté asignado a otro equipo
        if (equipo.getEntrenador() != null && equipoRepository.existsByEntrenador(equipo.getEntrenador())) {
            throw new IllegalArgumentException("El entrenador " + equipo.getEntrenador().getNombre() +
        "" + equipo.getEntrenador().getApellido() + "ya está asignado a otro equipo");
         }
         return equipoRepository.save(equipo);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Equipo> obtenerEquipoPorId(Long id) {
        return equipoRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoRepository.findAll();
    }

}
