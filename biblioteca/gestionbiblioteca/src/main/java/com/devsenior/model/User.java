package com.devsenior.model;

import lombok.Getter;

@Getter
public class User {
    private int id;
    private String nombre;

    public User(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String toString(){
        return "id: "+id+" nombre: "+nombre;
    }

    
}
