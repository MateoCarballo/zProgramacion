package Ejercicios.Ejercicio2;

import Utilidades.UtilidadesMatematicas;

public class Main {

    public static void main(String[] args) {

        int matrizAleatorios[] =new int[50];
        int maximo=100;
        int minimo=199;
        int acumulado=0;
        int media=0;
        for (int i = 0; i < matrizAleatorios.length ; i++) {
        matrizAleatorios[i]=(UtilidadesMatematicas.numAleatorio(100,199));
        acumulado+=matrizAleatorios[i];

        if (maximo< matrizAleatorios[i]){
            maximo= matrizAleatorios[i];
        }
        if (minimo> matrizAleatorios[i]){
                minimo= matrizAleatorios[i];
        }
        }
        System.out.print(" Numero mas elevado es ->"+maximo);
        System.out.print(" // Numero mas bajo es ->"+minimo);
        System.out.print(" // La Media es ->"+(acumulado/50)+"\n");

        ordenarMatriz(matrizAleatorios);
        for (int i = 0; i < matrizAleatorios.length; i++) {
            System.out.println("["+i+"]"+"<->"+matrizAleatorios[i]);
        }

}

public static void ordenarMatriz(int matriz[]){
        /*
        Al ser una matriz no nos hace falta retornar nada
        porque el puntero nos dice en que parte de la memoria están
        almacenados los datos y los modificamos directamente
         */

    int trasvase=0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if(matriz[i]<matriz[j]){
                trasvase=matriz[i];
                matriz[i]=matriz[j];
                matriz[j]=trasvase;
            }
        }
    }
}
}
