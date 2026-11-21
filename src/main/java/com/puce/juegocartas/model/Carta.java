package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Carta del juego (ataque, defensa o habilidad)
@Entity
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int costoEnergia;
    @Enumerated(EnumType.STRING)
    private TipoCarta tipo;
    private int valor; // daño, bloqueo, etc.
    // TODO: constructores, getters y setters
}
