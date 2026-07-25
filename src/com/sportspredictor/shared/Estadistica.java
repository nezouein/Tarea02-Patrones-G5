package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class Estadistica {
    private String id;
    private String tipo;
    private String descripcion;
    private double valor;
    private LocalDateTime fechaActualizacion;

    public Estadistica(String id, String tipo, String descripcion, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fechaActualizacion = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public double getValor() { return valor; }
    public LocalDateTime getFechaActualizacion() { return fechaActualizacion; }

    @Override
    public String toString() {
        return String.format("Estadistica[%s: %s = %.2f]", tipo, descripcion, valor);
    }
}
