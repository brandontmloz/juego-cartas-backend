package com.puce.juegocartas.dto;

// Lo que devuelve la API después de cada acción en combate
public record EstadoCombateResponse(int vidaJugador, int energia, int turno, boolean terminado) {
}
