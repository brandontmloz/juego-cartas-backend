package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Una partida (run) completa
@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pisoActual;
    @Enumerated(EnumType.STRING)
    private EstadoPartida estado;
    private int semilla; // para que cada partida sea distinta
    // TODO: constructores, getters y setters
}
