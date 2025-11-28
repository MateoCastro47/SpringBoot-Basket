package com.edu.back.mcs.PracticaFinal.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edu.back.mcs.PracticaFinal.model.Equipo;
import com.edu.back.mcs.PracticaFinal.model.Partido;

public interface PartidoRepository extends JpaRepository<Partido, Long>{
    
    boolean existsByEquipoLocalAndEquipoVisitanteAndFecha(
        Equipo equipoLocal,
        Equipo equipoVisitante,
        LocalDate fechaPartido
    );

    Optional<Partido> findByEquipoLocalAndEquipoVisitanteAndFecha(
        Equipo equipoLocal,
        Equipo equipoVisitante,
        LocalDate fechaPartido
    );
}
