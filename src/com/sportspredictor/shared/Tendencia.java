package com.sportspredictor.shared;

public class Tendencia {
    private String descripcion;
    private double porcentaje;

    public Tendencia(String descripcion, double porcentaje) {
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() { return descripcion; }
    public double getPorcentaje() { return porcentaje; }

    @Override
    public String toString() {
        return String.format("Tendencia[%s: %.1f%%]", descripcion, porcentaje);
    }
}
