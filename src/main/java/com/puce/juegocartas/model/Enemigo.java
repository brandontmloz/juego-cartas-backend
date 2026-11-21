package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Enemigo o jefe de un combate
@Entity
public class Enemigo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int vidaMaxima;
    private int dano;
    private boolean esJefe;
    // TODO: constructores, getters y setters
}
