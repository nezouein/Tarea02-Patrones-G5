package com.sportspredictor.shared;

public class Administrador extends UsuarioSistema {

    public Administrador(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena);
    }

    public void registrarEvento(Evento evento) {
        System.out.println(nombre + " registró el evento: " + evento);
    }

    public void publicarResultado(Evento evento, String resultado) {
        evento.registrarResultado(resultado);
    }
}
