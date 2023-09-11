package com.martinbordon.llamartp.modelo;

public class Usuario {

    private String apellido;
    private String nombre;


    public Usuario(String apellido, String nombre, String telefono, int foto) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
