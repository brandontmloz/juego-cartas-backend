package com.puce.juegocartas.repository;

import com.puce.juegocartas.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {
}
