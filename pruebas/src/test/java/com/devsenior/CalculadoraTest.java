package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSuma(){
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testDivision(){
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDivisionPorCero(){
        Calculadora calc = new Calculadora();
        //se captura el resultado del metodo en una variable de tipo Exception
        //assertThrows: metodo para compara una exception con una funcion lambda que bote error
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calc.dividir(10, 0);
        });
        //assertEquals: metodo para comparar respuesta de un metodo o funcion y lo esperado
        assertEquals("no se puede dividir por cero", exception.getMessage());
    }
}
