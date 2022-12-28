import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int continuar = 1;
        String nombredeObjeto = "";
        String atributo = "";

        System.out.println("Programa generico para crear objetos de una clase privada");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*Creador de clases privadas
        le pasamos en nombre y el atributo1 al metodo y este es quien construye
        no podemos acceder desde fuera de esa clase?
         */


        do {
            System.out.println("Introduce el nombre del objeto");
            nombredeObjeto = br.readLine();
            System.out.println("Introduce el atributo 1");
            atributo = br.readLine();
            Creador.generadorObjeto(nombredeObjeto, atributo);
            System.out.println("Quieres repetir?(1=si/0=no)");
            continuar = Integer.parseInt(br.readLine());
        } while (continuar != 0);
    }
}