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
        int tipodeJuego = 10;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                
                Bienvenido al sorteo de la primitiva
                Puedes introducir tus propios numeros
                o dejar que te demos unos aleatorios.
                Que quieres hacer?
                
                1.Introducirlos manualmente.
                
                2.Generar de forma aleatoria.
                                
                Pulsa el numero de la opcion para continuar->""");
        tipodeJuego = Integer.parseInt(br.readLine());

        switch (tipodeJuego) {
            case 1:
                juegoManual = true;
                juegoMan();
                return;
            case 2:
                juegoManual = false;
                juegoAuto();
                return;
            default:
                return;

        }

    }
        public static void juegoMan () throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("No tiene control de datos no repitas numeros por favor"+"\n");
            do {
//Matriz con nuestra combinación

                for (int i = 0; i < combinacion.length; i++) {
                    if (i< combinacion.length-1){
                        System.out.println("Escribe el numero "+ (i+1));
                        combinacion[i]=Integer.parseInt(br.readLine());
                        System.out.println("\n");
                    }else{
                        System.out.println("Escribre tu reintegro");
                        combinacion[i]=Integer.parseInt(br.readLine());
                        System.out.println("\n");
                    }

                }

                utilidadesMatematicas.ordenarMatriz(combinacion, true);
// controlRepeticion(combinacion);
//Matriz combinacion premiada
                llenarMatriz(combiGanadora);
                utilidadesMatematicas.ordenarMatriz(combiGanadora, true);
                controlRepeticion(combiGanadora);
//Reintegros
//combinacion[6] = utilidadesMatematicas.numAleatorio(0, 9);
//combiGanadora[6] = utilidadesMatematicas.numAleatorio(0, 9);

                if (combinacion[6] == combiGanadora[6]) {
                    reintegro = true;
                } else {
                    reintegro = false;
                }

                System.out.print("Tu apuesta:----------->");
                imprimirPorPantalla(combinacion);

                System.out.print("Combinacion ganadora-->"+"\n");
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

        public static void juegoAuto () throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do {
//Matriz con nuestra combinación
                llenarMatriz(combinacion);
                utilidadesMatematicas.ordenarMatriz(combinacion, true);
                controlRepeticion(combinacion);
//Matriz combinacion premiada
                llenarMatriz(combiGanadora);
                utilidadesMatematicas.ordenarMatriz(combiGanadora, true);
                controlRepeticion(combiGanadora);
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

    public static void controlRepeticion(int [] miMatriz) {
        //Si coinciden dos numeros en distintas posiciones cambiamos el de la posicion mas adelantada y despues si hemos cambiado algo la volvemos a ordenar
        boolean seRepitenNumeros=false;
        do {
            for (int i = 0; i < miMatriz.length; i++) {
                for (int j = 0; j < miMatriz.length; j++) {
                /*
                Si estamos en distintas posiciones de la matriz comparamos
                 */
                    if ((i!=j)&&((miMatriz[i] == miMatriz[j]))) {
                    miMatriz[j] = utilidadesMatematicas.numAleatorio(1, 49);
                    seRepitenNumeros = true;
                    }
                }
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
