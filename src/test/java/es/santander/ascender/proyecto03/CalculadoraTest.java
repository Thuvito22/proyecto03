package es.santander.ascender.proyecto03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {

        long resultado = calculadora.sumar(5, 10);

        assertEquals(15, resultado, "10+5 debería ser 15");
    }

    @Test
    void testRestar() {
        long resultado = calculadora.restar(10, 4);
        assertEquals(6, resultado, "10-4 esperaba 6");
    }

    @Test
    public void testPresentaTablaMultiplicar() {
        calculadora.presentaTablaMultiplicar(8); 
    }


    @Test
    public void testCalcularTablaMultiplicar () {
        Calculadora calculadora = new Calculadora();

        calculadora.calcularTablamultiplicar(9);
        


    }
}