package com.puce.juegocartas.repository;

import com.puce.juegocartas.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
