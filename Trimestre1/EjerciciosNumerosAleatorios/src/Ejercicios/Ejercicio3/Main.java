package Ejercicios.Ejercicio3;

import Utilidades.UtilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
        boolean continuar=true;
        int a=0;

        do {
            String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            System.out.println(dias[UtilidadesMatematicas.numAleatorio(0, 6)]);
            a++;
            if (a==9){
                continuar=false;
            }
        }while(continuar);
    }



}