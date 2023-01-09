package Avanzados.Ejercicio10;

import misUtilidades.utilidadesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        int tamañoMatriz=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Numero de alturas a registrar?");
        tamañoMatriz=Integer.parseInt(br.readLine());
        double matrizAlturas[]=new double [tamañoMatriz];
        /*
        Posicion 0-> Media de las alturas
        Posicion 1-> Maximo
        Posicion 2-> Minimo
         */
        double resultados[]=new double[2];
        llenarMatriz(matrizAlturas);
        System.out.println("La media de todas las alturas introducidas es->"+(mediaMatriz(matrizAlturas)));
        System.out.println("La mayor altura es->"+maximoMatriz(matrizAlturas));
        System.out.println("La menor altura es->"+minimoMatriz(matrizAlturas));

        /*
        No necesito otra matriz para meter los valores ordenados o llenados porque a diferencia de las variables
        apuntamos a la posicion de memoria en la que se encuentra (paso por valor), es decir, no trabajamos con una
        copia sino con la propia matriz.
         */
    }
    public static void llenarMatriz(double[]miMatriz)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Posicion "+i+":");
            miMatriz[i]= Double.parseDouble(br.readLine());
        }
    }
    public static double mediaMatriz(double[]miMatriz){
        double mediaValoresMatriz=0;
        for (int i = 0; i < miMatriz.length; i++) {
            mediaValoresMatriz=mediaValoresMatriz+miMatriz[i];
        }
        mediaValoresMatriz=(mediaValoresMatriz/miMatriz.length);
        return mediaValoresMatriz;
    }

    public static double maximoMatriz(double[]miMatriz){
        double maximo=0;

        for (int i = 0; i < miMatriz.length; i++) {
            //la primera vez cargamos como valor maximo el de la primera posicion
            if (i==0){
                maximo=miMatriz[i];
            }
            /*
            A partir de este momento si el número guardado en la posicion i es mayor que mi maximo
            se convierte en mi nuevo maximo
             */
            if ((i!=0)&&(maximo<miMatriz[i])){
                maximo=miMatriz[i];
            }
        }
        return maximo;
    }
    public static double minimoMatriz(double[]miMatriz){
        double minimo=0;

        for (int i = 0; i < miMatriz.length; i++) {
            //la primera vez cargamos como valor maximo el de la primera posicion
            if (i==0){
                minimo=miMatriz[i];
            }
            /*
            A partir de este momento si el número guardado en la posicion i es mayor que mi maximo
            se convierte en mi nuevo maximo
             */
            if ((i!=0)&&(minimo>miMatriz[i])){
                minimo=miMatriz[i];
            }
        }
        return minimo;
    }



}
