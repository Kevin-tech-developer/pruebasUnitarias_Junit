package com.devsenior.model;

import java.util.Date;

import lombok.Getter;

@Getter
public class Tarjeta {
    private String numeroDeTarjeta;
    private Date fechaExpiracion;
    private int codigoCVV;
    private boolean estado;
    private int tipoTarjeta;
    private String banco;

    
    public Tarjeta(String numeroDeTarjeta, Date fechaExpiracion, int codigoCVV, boolean estado, int tipoTarjeta,
            String banco) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoCVV = codigoCVV;
        this.estado = estado;
        this.tipoTarjeta = tipoTarjeta;
        this.banco = banco;
    }

    public String toString(){
        return "numero tarjeta: "+numeroDeTarjeta + "fecha expiracion: " + fechaExpiracion+" estado: "+estado+" tipo de tarjeta: "+tipoTarjeta+ "banco: "+banco;
    }


}
