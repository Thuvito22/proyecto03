package es.santander.ascender.proyecto03;

public class TestSumando1 {
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;

        @test
        public void testSumar() 
            Calculadora calculadora = new Calculadora();    
        long resultado = calculadora.sumar(5,10);
        assertEquals(15, resultado, "10+5 debería ser 15");
    
    }
