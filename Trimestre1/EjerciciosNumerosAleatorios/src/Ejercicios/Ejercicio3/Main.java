package Ejercicios.Ejercicio3;

import Utilidades.utilidadesMatematicas;

public class Main {


    public static void main(String[] args) {
        boolean continuar=true;
        int a=0;

        do {
            String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            System.out.println(dias[utilidadesMatematicas.numAleatorio(0, 6)]);
            a++;
            if (a==10){
                continuar=false;
            }
        }while(continuar);
    }



}