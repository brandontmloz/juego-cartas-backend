package com.puce.juegocartas.repository;

import com.puce.juegocartas.model.Enemigo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemigoRepository extends JpaRepository<Enemigo, Long> {
}
