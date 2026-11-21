package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Casilla del mapa (combate, tienda, descanso, jefe...)
@Entity
public class NodoMapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int piso;
    @Enumerated(EnumType.STRING)
    private TipoNodo tipo;
    private boolean visitado;
    // TODO: constructores, getters y setters
}
