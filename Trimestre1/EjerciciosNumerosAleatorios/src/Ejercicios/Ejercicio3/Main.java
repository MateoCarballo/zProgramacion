package Ejercicios.Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
       diaDeLaSemana();
    }

    public static void diaDeLaSemana()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int entrada =0;

        do {
            System.out.println("Pulsa 1 para que te diga otro dia");
            int aleatorio = (int) (Math.random() * (7) + 1);
            System.out.println(aleatorio);
            entrada=Integer.parseInt(br.readLine());
        }while(entrada!=0);
    }

}