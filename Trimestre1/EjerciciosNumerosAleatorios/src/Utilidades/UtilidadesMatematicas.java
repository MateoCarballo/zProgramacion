package Utilidades;

import java.util.Random;

public class UtilidadesMatematicas {
    public static int numAleatorio(int limInferior, int limSuperior){

        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    public static boolean booleanoConSemilla (int limiteInferior,int limiteSuperior,int valorSemilla){
        /*
        Genera aleatoriamente valores booleanos (0-1), al introducirle
        una semilla el conjunto de resultados será idéntico.

        Este "generador.next<tipodeDato>();"
        puede generar valores aleatorios de int, float etc.

         */
           Random generador = new Random(valorSemilla);
           boolean miBooleano = generador.nextBoolean();
           return miBooleano;
    }


}
