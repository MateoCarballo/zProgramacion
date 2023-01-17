package Avanzados.Ejercicio12;


import misUtilidades.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        int tamanoMatriz = 10;
        String posicion;
        String valor;
        String continuar="";
        System.out.println("#########Bienvenido al rellenador de matrices#########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] matrizEntradas = new int[tamanoMatriz];

        do {
            System.out.println("""                            
                    Elige una de las siguientes opciones:
                    a) Mostrar valores.
                    b) Introducir valor.
                    c) Cerrar aplicacion.""");
            continuar = br.readLine();

            if (continuar.equals("a")){
                mostrarValores(matrizEntradas);
                System.out.println("zzzz");
                utilidadesMatematicas.organizarMatriz(matrizEntradas);
            }
            if (continuar.equals("b")){
                System.out.println("Posicion?");
                posicion=br.readLine();
                System.out.println("Valor?");
                valor=br.readLine();
                llenarMatriz(matrizEntradas,Integer.parseInt(posicion),Integer.parseInt(valor));
            }

        }while((continuar.equals("a"))|(continuar.equals("b")));
    }

    public static void mostrarValores(int[]miMatriz){
        for (int i = 0; i < miMatriz.length ; i++) {
            System.out.println("Posicion "+i+"-->"+miMatriz[i]);
        }
    }

    public static void llenarMatriz(int[] miMatriz,int posicion,int valor){
        miMatriz[posicion]=valor;
    }

}
