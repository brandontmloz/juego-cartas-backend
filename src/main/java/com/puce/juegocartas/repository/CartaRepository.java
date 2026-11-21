package com.puce.juegocartas.repository;

import com.puce.juegocartas.model.Carta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository extends JpaRepository<Carta, Long> {
}
