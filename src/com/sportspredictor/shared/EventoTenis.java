package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class EventoTenis extends Evento {
    private String jugadorUno;
    private String jugadorDos;
    private int setsJugadorUno;
    private int setsJugadorDos;

    public EventoTenis(String id, String nombre, LocalDateTime fechaInicio,
                        String jugadorUno, String jugadorDos) {
        super(id, nombre, fechaInicio);
        this.jugadorUno = jugadorUno;
        this.jugadorDos = jugadorDos;
    }

    public String getJugadorUno() { return jugadorUno; }
    public String getJugadorDos() { return jugadorDos; }
}
