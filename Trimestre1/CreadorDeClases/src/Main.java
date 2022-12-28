import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        int numerodeObjetos=0;

        System.out.println("Programa para poder crear clases numeradas en automatico");
        System.out.println("Dime cuantos objetos quieres de la clase");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Recoge cuantos objetos vamos a crear de la clase
        numerodeObjetos=Integer.parseInt(br.readLine());

    }
}