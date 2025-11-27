package com.edu.back.mcs.PracticaFinal.Services;

import java.util.List;
import java.util.Optional;
import com.edu.back.mcs.PracticaFinal.model.Liga;
import com.edu.back.mcs.PracticaFinal.model.DTO.LigaDetalleDTO;

public interface ILigaService {
    
    Liga crearLiga(LigaDetalleDTO dto);

    Optional<Liga> obtenerLigaPorId(Long id);

    List<Liga> obtenerTodasLasLigas();

    Liga actualizarLiga(Long id, LigaDetalleDTO dto);

    void borrarLiga(Long id);
}
