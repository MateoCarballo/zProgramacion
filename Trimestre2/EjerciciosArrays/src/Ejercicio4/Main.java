package Ejercicio4;

import misUtilidades.utilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int acumuladoPos=0;
        int acumuladoNeg=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] matrizEnteros =new int[5];
        for (int i = 0; i < matrizEnteros.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matrizEnteros[i]=Integer.parseInt(br.readLine());
            if (matrizEnteros[i]>0){
                acumuladoPos=acumuladoPos+matrizEnteros[i];
            }else{
                acumuladoNeg=acumuladoNeg+matrizEnteros[i];
            }
        }

        utilidadesMatematicas.ordenarMatrizInt(matrizEnteros,true);
        System.out.println("La suma de todos los negativos es  ->"+ acumuladoNeg);
        System.out.println("La suma de todos los positivos es  ->"+ acumuladoPos);
    }
}