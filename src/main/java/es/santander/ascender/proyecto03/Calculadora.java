package es.santander.ascender.proyecto03;

public class Calculadora {
    public long sumar(long sumando1, long sumando2) {
        return sumando1 + sumando2;

    }
    public long restar(long substraendo, long minuendo) {
        return substraendo - minuendo;
    }

    public long multiplicar(long factor1, long factor2){
        return multiplicar(factor1, factor2);
    }
    public long dividir(long dividendo, long divisor) {
        return dividendo / divisor;
    }


    public void presentaTablaMultiplicar(int numero) {
        for (int i = 0 ; i <= 10; i = i + 1) {

            System.out.println(i + numero);

        } 
    
    }

    public void calcularTablamultiplicarprense(int numero){
        int[] resultados = null; resultados = null;

        int [] borrame = new int [11];
        borrame [0] = 3;

        borrame [4] = 6;

        borrame [7] = borrame[0] + borrame[4];

        borrame [7] = borrame [0] + borrame [4];
        System.out.println(borrame[7]);



    }
}


