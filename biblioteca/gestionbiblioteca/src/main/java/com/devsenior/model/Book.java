package com.devsenior.model;

import lombok.Getter;

@Getter
public class Book {
    private int id;
    private String titulo;
    private String autor;

    public Book(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString(){
        return "id: "+id+ " titulo: "+titulo+ " autor: "+autor;
    }

    
}
