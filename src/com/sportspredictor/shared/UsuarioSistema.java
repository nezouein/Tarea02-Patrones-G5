package com.sportspredictor.shared;

public abstract class UsuarioSistema {
    protected String id;
    protected String nombre;
    protected String email;
    protected String contrasena;

    public UsuarioSistema(String id, String nombre, String email, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion() {
        return true;
    }

    public void cerrarSesion() {
        // Lógica de cierre de sesión
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
