package com.sportspredictor.shared;

/**
 * Contrato del patrón Chain of Responsibility.
 * Implementado por ManejadorBase (y sus subclases ManejadorSoporte,
 * ManejadorControlCalidad) en el paquete com.sportspredictor.chain
 * (rama: feature/chain-of-responsibility).
 */
public interface ManejadorIncidente {
    ManejadorIncidente establecerSiguiente(ManejadorIncidente manejador);
    void manejar(ReporteIncidencia reporte);
}
