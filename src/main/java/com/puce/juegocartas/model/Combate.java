package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Combate entre el jugador y uno o más enemigos
@Entity
public class Combate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int turno;
    private int energiaActual;
    private boolean terminado;
    // TODO: constructores, getters y setters
}
