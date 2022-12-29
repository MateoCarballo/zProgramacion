package Ejercicios.Ejercicio5;

import Utilidades.utilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        // Tomamos como reintegro la ultima posición
        int continuar=1;
        int combinacion[]=new int [7];
        int combiGanadora[]=new int [7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
        for (int i = 0; i < (combinacion.length); i++) {
            combinacion[i]= utilidadesMatematicas.numAleatorio(1,49);
        }

        //Se cambia la matriz directamente, puesto que apuntamos al bloque de memoria donde se encuentra la matriz
        utilidadesMatematicas.ordenarMatriz(combinacion,true);
        controlRepeticion(combinacion);
        combinacion[6]= utilidadesMatematicas.numAleatorio(0,9);
        //Para poder ordenarlo necesito sacar la impresion por pantalla

            for (int i = 0; i < combinacion.length; i++) {
                if (i == (combinacion.length - 1)) {
                    System.out.print("R->");
                }
                System.out.print(combinacion[i] + " ");
            }
            System.out.println("");
            System.out.println("Otro intento? (1=Si/0=No)");
            continuar=Integer.parseInt(br.readLine());
        }while(continuar!=0);
    }

    public static void controlRepeticion(int [] miMatriz) {
        //Si coinciden dos numeros en distintas posiciones cambiamos el de la posicion mas adelantada y despues si hemos cambiado algo la volvemos a ordenar
        boolean seRepitenNumeros=false;
        do {
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if (miMatriz[i] != miMatriz[j]) {
                        if (miMatriz[i] == miMatriz[j]) {
                            miMatriz[j] = utilidadesMatematicas.numAleatorio(1, 49);
                            seRepitenNumeros = true;
                        }
                    }
                }
            }
            if (seRepitenNumeros) {
                utilidadesMatematicas.ordenarMatriz(miMatriz, true);
                seRepitenNumeros=false;
            }
        }while(seRepitenNumeros);
    }
}
