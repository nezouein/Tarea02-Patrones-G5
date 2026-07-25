package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class EventoBaloncesto extends Evento {
    private String equipoLocal;
    private String equipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    public EventoBaloncesto(String id, String nombre, LocalDateTime fechaInicio,
                             String equipoLocal, String equipoVisitante) {
        super(id, nombre, fechaInicio);
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() { return equipoLocal; }
    public String getEquipoVisitante() { return equipoVisitante; }
}
