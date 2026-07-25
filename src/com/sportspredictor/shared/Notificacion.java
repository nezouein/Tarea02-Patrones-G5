package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class Notificacion {
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;

    public Notificacion(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha = LocalDateTime.now();
    }

    public String getTitulo() { return titulo; }
    public String getMensaje() { return mensaje; }
    public LocalDateTime getFecha() { return fecha; }

    @Override
    public String toString() {
        return String.format("[%s] %s", titulo, mensaje);
    }
}
