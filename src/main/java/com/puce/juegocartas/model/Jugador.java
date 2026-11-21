package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Personaje del jugador dentro de una partida
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int vidaMaxima;
    private int vidaActual;
    private int oro;
    // TODO: constructores, getters y setters
}
