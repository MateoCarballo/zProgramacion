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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
        for (int i = 0; i < (combinacion.length); i++) {
            combinacion[i]= utilidadesMatematicas.numAleatorio(1,49);
        }

        //Se cambia la matriz directamente, puesto que apuntamos al bloque de memoria donde se encuentra la matriz
        utilidadesMatematicas.ordenarMatriz(combinacion,true);
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
}
