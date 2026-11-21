package com.puce.juegocartas.dto;

// Datos que envía el cliente al jugar una carta
public record JugarCartaRequest(Long cartaId, Long enemigoId) {
}
