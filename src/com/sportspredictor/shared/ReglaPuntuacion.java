package com.sportspredictor.shared;

public class ReglaPuntuacion {
    private String id;
    private String categoria;
    private int puntosPorAcierto;

    public ReglaPuntuacion(String id, String categoria, int puntosPorAcierto) {
        this.id = id;
        this.categoria = categoria;
        this.puntosPorAcierto = puntosPorAcierto;
    }

    public boolean validar() {
        return puntosPorAcierto > 0;
    }

    public int getPuntosPorAcierto() { return puntosPorAcierto; }
}
