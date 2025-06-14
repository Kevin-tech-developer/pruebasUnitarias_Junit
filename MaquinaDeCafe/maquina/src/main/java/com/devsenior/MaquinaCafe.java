package com.devsenior;

public class MaquinaCafe {
    private boolean tieneAgua;
    private boolean tieneCafe;

    public MaquinaCafe(boolean tieneAgua, boolean tieneCafe){
        this.tieneAgua = tieneAgua;
        this.tieneCafe = tieneCafe;
    }

    public String hacerCafe(){
        if(!tieneAgua && !tieneCafe) return "falta agua y cafe";
        if(!tieneAgua) return "falta agua";
        if(!tieneCafe) return "falta cafe";
        return "cafe listo";
    }
}
