package com.sportspredictor.shared;

import java.util.List;

/**
 * Contrato del patrón Adapter (rol Target).
 * Implementado por ProveedorEstadisticasAdapter
 * en el paquete com.sportspredictor.adapter (rama: feature/adapter).
 */
public interface ServicioEstadisticas {
    List<Estadistica> obtenerEstadisticas(String eventoId);
    List<Estadistica> obtenerHistorial(String eventoId);
    List<Tendencia> obtenerTendencias(String eventoId);
}
