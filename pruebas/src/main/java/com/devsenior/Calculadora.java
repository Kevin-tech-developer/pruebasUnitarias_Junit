package com.devsenior;

public class Calculadora {
    public int sumar(int a, int b){
        return a+b;
    }
    public float dividir(int a, int b){
        if(b==0) throw new IllegalArgumentException("no se puede dividir por cero");
        return a/b;
    }
}
