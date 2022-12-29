package Ejercicios.Ejercicio5;

import Utilidades.utilidadesMatematicas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int combinacion[]=new int [7];
    static int combiGanadora[]=new int [7];
    static int continuar=1;
    static boolean reintegro=false;
    static boolean juegoManual = false;

    static int tipodeJuego = 10;
    public static void main(String[] args) throws IOException {
        // Tomamos como reintegro la ultima posición
        int tipodeJuego =2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                
                Bienvenido al sorteo de la primitiva
                Puedes introducir tus propios numeros
                o dejar que te demos unos aleatorios.
                Que quieres hacer?
                
                1.Introducirlos manualmente.
                
                2.Generar de forma aleatoria.
                
                3.Salir.
                                
                Pulsa el numero de la opcion para continuar->""");
        tipodeJuego = Integer.parseInt(br.readLine());
        do {
            switch (tipodeJuego) {
                case 1:
                    juegoManual = true;
                    Man();
                    return;
                case 2:
                    juegoManual = false;
                    Auto();
                    return;
                default:
                    return;

            }
        }while(continuar!=3);

    }
        public static void Man () throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("No tiene control de datos no repitas numeros por favor"+"\n");
            do {
//Matriz con nuestra combinación

                for (int i = 0; i < combinacion.length; i++) {
                    if (i< combinacion.length-1){
                        System.out.println("Escribe el numero "+ (i));
                        combinacion[i]=Integer.parseInt(br.readLine());
                        System.out.println("\n");
                    }else{
                        System.out.println("Escribre tu reintegro");
                        combinacion[i]=Integer.parseInt(br.readLine());
                        System.out.println("\n");
                    }

                }

                utilidadesMatematicas.ordenarMatriz(combinacion, true);
                controlRepeticion(combinacion,juegoManual);
//Matriz combinacion premiada
                llenarMatriz(combiGanadora);
                utilidadesMatematicas.ordenarMatriz(combiGanadora, true);
                controlRepeticion(combiGanadora,!juegoManual);
//Reintegros
//combinacion[6] = utilidadesMatematicas.numAleatorio(0, 9);
                combiGanadora[6] = utilidadesMatematicas.numAleatorio(0, 9);

                if (combinacion[6] == combiGanadora[6]) {
                    reintegro = true;
                } else {
                    reintegro = false;
                }

                System.out.print("Tu apuesta:----------->");
                imprimirPorPantalla(combinacion);

                System.out.print("Combinacion ganadora-->");
                imprimirPorPantalla(combiGanadora);

                System.out.println("Has acertado->" + comprobarSorteo(combinacion, combiGanadora) + " numeros "+"\n");

                if (reintegro) {
                    System.out.println("Tu reintegro coincide");
                } else {
                    System.out.println("Tu reintegro no coincide");
                }

                System.out.println();
                System.out.println("Seguir en manual? (1=Continuar/0=Salir)");
                continuar = Integer.parseInt(br.readLine());
            } while (continuar != 0);
        }

        public static void Auto () throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do {
//Matriz con nuestra combinación
                llenarMatriz(combinacion);
                utilidadesMatematicas.ordenarMatriz(combinacion, true);
                controlRepeticion(combinacion,false);
//Matriz combinacion premiada
                llenarMatriz(combiGanadora);
                utilidadesMatematicas.ordenarMatriz(combiGanadora, true);
                controlRepeticion(combiGanadora,false);
//Reintegros
                combinacion[6] = utilidadesMatematicas.numAleatorio(0, 9);
                combiGanadora[6] = utilidadesMatematicas.numAleatorio(0, 9);

                if (combinacion[6] == combiGanadora[6]) {
                    reintegro = true;
                } else {
                    reintegro = false;
                }

                System.out.print("Tu apuesta:----------->");
                imprimirPorPantalla(combinacion);

                System.out.print("Combinacion ganadora-->");
                imprimirPorPantalla(combiGanadora);

                System.out.println("Has acertado->" + comprobarSorteo(combinacion, combiGanadora) + "numeros ");
                if (reintegro) {
                    System.out.println("Tu reintegro coincide");
                } else {
                    System.out.println("Tu reintegro no coincide");
                }
                System.out.println();
                System.out.println("Otro intento? (1=Si/0=No)");
                continuar = Integer.parseInt(br.readLine());
            } while (continuar != 0);
        }

    public static void controlRepeticion(int [] miMatriz,boolean manual) throws IOException{
        int lbucle= miMatriz.length;
        int reintegro=0;
        reintegro=miMatriz[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Si coinciden dos numeros en distintas posiciones cambiamos el de la posicion mas adelantada y despues si hemos cambiado algo la volvemos a ordenar

        // Si estamos en la parte manual comprobamos la repeticion en los numeros sin el reintegro
        if (manual){
            lbucle--;
        }
        boolean seRepitenNumeros=false;
        do {
            for (int i = 0; i < lbucle; i++) {
                for (int j = 0; j < lbucle; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if ((i != j) && ((miMatriz[i] == miMatriz[j]))) {
                        if (!manual) {
                            miMatriz[j] = utilidadesMatematicas.numAleatorio(1, 49);
                            seRepitenNumeros = true;
                        }
                        if (manual) {
                            System.out.println("Repites un numero en las posiciones:" + "\n" + i + " y " + j + " con valores-> " + miMatriz[i] + " y " + miMatriz[j]);
                            System.out.println("Introduce un valor valido para la segunda posicion");
                            miMatriz[j] = Integer.parseInt(br.readLine());
                        }

                    }
                }
            }
            if (manual){
                utilidadesMatematicas.ordenarMatriz(miMatriz, true);
                miMatriz[6]=reintegro;
            }
            if (seRepitenNumeros) {
                utilidadesMatematicas.ordenarMatriz(miMatriz, true);
                seRepitenNumeros=false;
            }
        }while(seRepitenNumeros);
    }

    public static void llenarMatriz(int[]miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i]= utilidadesMatematicas.numAleatorio(1,49);
        }
    }

    public static int comprobarSorteo(int[]miMatriz1,int[]miMatriz2){
        //Las matrices deben ser de la misma longitud
        int posicionesIguales=0;
        for (int i = 0; i < (miMatriz1.length-1); i++) {
            for (int j = 0; j < (miMatriz1.length-1); j++) {
                if ((miMatriz1[i] == miMatriz2[j])) {
                    posicionesIguales++;
                }
            }

        }
        return posicionesIguales;
    }

    public static void imprimirPorPantalla(int [] miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
            if (i == (miMatriz.length - 1)) {
                System.out.print("R->");
            }
            System.out.print(miMatriz[i] + " ");
        }
        System.out.println("");
    }
}
