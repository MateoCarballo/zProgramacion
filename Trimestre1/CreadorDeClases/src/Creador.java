public class Creador {

String nombreClaseI;
String atributo1I;
//Static para poder usarlo en el metodo generador secuencial
private static int contador=0;
/*
Si el creador es private solo le puede llamar desde la misma clase?
 */

    private Creador(String nombreClase, String atributo1) {
        this.nombreClaseI = nombreClase;
        atributo1I = atributo1;

    }

    private String getNombreClaseI() {
        return nombreClaseI;
    }

    private void setNombreClaseI(String nombreClaseI) {
        this.nombreClaseI = nombreClaseI;
    }

    private String getAtributo1I() {
        return atributo1I;
    }

    private void setAtributo1I(String atributo1I) {
        this.atributo1I = atributo1I;
    }

    public static void generadorObjeto(String nombreObjeto, String atributo1){
        contador++;
        Creador miNuevoObjeto =new Creador(nombreObjeto,atributo1);
        System.out.println(miNuevoObjeto.getNombreClaseI()+" "+miNuevoObjeto.getAtributo1I());
        System.out.println("Escrito desde el metodo de la propia clase");

    }

}
