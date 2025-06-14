package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaquinaCafeTest {

    @Test
    void hacerCafeListoTest(){
        MaquinaCafe maquina = new MaquinaCafe(true, true);
        //assertEquals: metodo de junit para comparar respuesta de un metodo o funion con una respuesta esperada
        assertEquals("cafe listo", maquina.hacerCafe());
    }

    @Test //argumento
    void hacerCafeNoListoTest(){//por ser metodos de prueba no retorna nada
        MaquinaCafe maquina = new MaquinaCafe(false, false);
        assertEquals("falta agua y cafe", maquina.hacerCafe());
    }

    @Test
    void noHayCafeTest(){
        MaquinaCafe maquina = new MaquinaCafe(true, false);
        assertEquals("falta cafe", maquina.hacerCafe());//metodo de junit, para comparar respuesta 
    }

    @Test
    void noHayAguaTest(){
        MaquinaCafe maquina = new MaquinaCafe(false, true);
        assertEquals("falta agua", maquina.hacerCafe());
    }
}
