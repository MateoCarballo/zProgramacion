package Ejercicios.Ejercicio5;

import Utilidades.UtilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        // Tomamos como reintegro la ultima posición
        int combinacion[]=new int [7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i]=UtilidadesMatematicas.numAleatorio(1,49);
            if (i== (combinacion.length-1)){
                System.out.print("R->");
            }
            System.out.print(combinacion[i]+" ");

        }


    }
}
