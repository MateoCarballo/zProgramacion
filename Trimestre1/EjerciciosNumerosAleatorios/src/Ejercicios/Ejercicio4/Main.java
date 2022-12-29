package Ejercicios.Ejercicio4;

import Utilidades.utilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException{
        int continuar=1;
        int dado;
        int suma;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            dado=0;
            suma=0;
            for (int i = 1; i <= 3; i++) {
              dado= utilidadesMatematicas.numAleatorio(1,6);
              System.out.print("Tirada "+i+"->");
              System.out.print(dado+" ");
              suma+=dado;
            }
            System.out.println(" ");
            System.out.println("La tirada suma -> "+suma);
            System.out.println("Otra tirada? (1=Si/0=No)");
            continuar=Integer.parseInt(br.readLine());
        }while(continuar!=0);

    }
}