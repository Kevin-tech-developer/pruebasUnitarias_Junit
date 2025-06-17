package com.devsenior.model;

import lombok.Getter;

@Getter
public class Usuario {
    private String nombre;
    private Tarjeta tarjeta;

    public Usuario(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    
}
