package com.devsenior.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Loan {
    private int id;
    private User user;
    private Book book;
    private LocalDate date;

    public Loan(int id, User user, Book book, LocalDate date) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.date = date;
    }

    public String toString(){
        return "id: "+id+" user: "+user.getNombre()+" book: "+book.getTitulo()+" date: "+date;
    }

    
}
