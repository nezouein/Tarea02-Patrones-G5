package com.sportspredictor.shared;

import java.time.LocalDateTime;

public class EventoFutbol extends Evento {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public EventoFutbol(String id, String nombre, LocalDateTime fechaInicio,
                         String equipoLocal, String equipoVisitante) {
        super(id, nombre, fechaInicio);
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public String getEquipoLocal() { return equipoLocal; }
    public String getEquipoVisitante() { return equipoVisitante; }
}
