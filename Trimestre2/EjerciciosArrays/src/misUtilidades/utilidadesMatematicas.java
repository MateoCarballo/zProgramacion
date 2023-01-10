package misUtilidades;

import java.util.Random;

public class utilidadesMatematicas {
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    public static double numAleatorioDouble(int limInferior, int limSuperior){
        Double aleatorio = (Double)(Math.random()*(limSuperior-limInferior+1)+limInferior);
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

    public static void ordenarMatriz(double[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        double aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;

                        }
                    }

                }

            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;

                        }
                    }

                }

            }
        }

    }

    public static void ordenarMatrizInt(int[] miMatriz,boolean Ordenascendente){
        /*
        Ordenar matrices si el booleano es true de menor a mayor si es false de menor a mayor.
         */
        int aux=0;
        if (Ordenascendente){
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]< miMatriz[j]){
                            aux=miMatriz[i];
                            miMatriz[i]=miMatriz[j];
                            miMatriz[j]=aux;

                        }
                    }

                }

            }
        }else{
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if(miMatriz[i]!=miMatriz[j]){
                        if (miMatriz[i]> miMatriz[j]){
                            aux=miMatriz[j];
                            miMatriz[j]=miMatriz[i];
                            miMatriz[i]=aux;

                        }
                    }

                }

            }
        }

    }

    public static void organizarMatriz(int[]mimatriz){
        for (int i = 0; i < 4; i++) {
            if (i< mimatriz.length){
                System.out.print("|| ");
            }
            for (int j = 0; j <4 ; j++) {
                if (i< mimatriz.length){
                    System.out.print(mimatriz[i]);
                }
            }
        }
    }
}
