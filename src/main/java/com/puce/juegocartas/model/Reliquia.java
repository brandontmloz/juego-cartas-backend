package com.puce.juegocartas.model;

import jakarta.persistence.*;

// Objeto pasivo que da ventajas durante la partida
@Entity
public class Reliquia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String efecto;
    // TODO: constructores, getters y setters
}
