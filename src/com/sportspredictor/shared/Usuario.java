package com.sportspredictor.shared;

public class Usuario extends UsuarioSistema {
    private int puntos;

    public Usuario(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena);
        this.puntos = 0;
    }

    public int getPuntos() { return puntos; }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    @Override
    public String toString() {
        return String.format("Usuario[%s, puntos=%d]", nombre, puntos);
    }
}
