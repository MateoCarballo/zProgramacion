package Ejercicios.Ejercicio5;

import Utilidades.utilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        // Tomamos como reintegro la ultima posición
        int combinacion[]=new int [7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i]= utilidadesMatematicas.numAleatorio(1,49);
        }
        //Se cambia la matriz directamente, puesto que apuntamos al bloque de memoria donde se encuentra la matriz
        utilidadesMatematicas.ordenarMatriz(combinacion,true);

        //Para poder ordenarlo necesito sacar la impresion por pantalla
        for (int i = 0; i <combinacion.length-1 ; i++) {
            if (i== (combinacion.length-1)){
                System.out.print("R->");
            }
            System.out.print(combinacion[i]+" ");
        }

    }
}
