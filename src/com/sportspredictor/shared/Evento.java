package com.sportspredictor.shared;

import java.time.LocalDateTime;

public abstract class Evento {
    protected String id;
    protected String nombre;
    protected LocalDateTime fechaInicio;
    protected EstadoEvento estado;

    public Evento(String id, String nombre, LocalDateTime fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estado = EstadoEvento.ABIERTO;
    }

    public boolean estaAbierto() {
        return estado == EstadoEvento.ABIERTO;
    }

    public void cerrarPronosticos() {
        this.estado = EstadoEvento.CERRADO;
    }

    public void registrarResultado(String resultado) {
        this.estado = EstadoEvento.FINALIZADO;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public EstadoEvento getEstado() { return estado; }

    @Override
    public String toString() {
        return nombre + " (" + estado + ")";
    }
}
