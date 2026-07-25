package com.sportspredictor.shared;

/**
 * Contrato del patrón Factory Method.
 * Implementado por PronosticoFutbol, PronosticoBaloncesto y PronosticoTenis
 * en el paquete com.sportspredictor.factory (rama: feature/factory-method).
 */
public interface Pronostico {
    void evaluar(String resultado);
    int calcularPuntos();
    EstadoPronostico obtenerEstado();
}
