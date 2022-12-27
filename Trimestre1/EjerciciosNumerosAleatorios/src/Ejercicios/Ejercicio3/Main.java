package Ejercicios.Ejercicio3;

import Utilidades.UtilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {

       String dias []={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
       System.out.println(dias[UtilidadesMatematicas.numAleatorio(0,6)]);

    }



}