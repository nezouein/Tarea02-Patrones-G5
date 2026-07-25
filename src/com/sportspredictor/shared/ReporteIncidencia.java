package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class ReporteIncidencia {
    private String id;
    private String descripcion;
    private String evidencia;
    private int gravedad;
    private EstadoReporte estado;
    private LocalDateTime fechaCreacion;

    public ReporteIncidencia(String id, String descripcion, String evidencia, int gravedad) {
        this.id = id;
        this.descripcion = descripcion;
        this.evidencia = evidencia;
        this.gravedad = gravedad;
        this.estado = EstadoReporte.REGISTRADO;
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public String getEvidencia() { return evidencia; }
    public int getGravedad() { return gravedad; }
    public EstadoReporte getEstado() { return estado; }

    public void actualizarEstado(EstadoReporte estado) {
        this.estado = estado;
    }

    public void cerrar() {
        this.estado = EstadoReporte.RESUELTO;
    }

    @Override
    public String toString() {
        return String.format("Reporte[%s] %s (gravedad=%d, estado=%s)",
                id, descripcion, gravedad, estado);
    }
}
