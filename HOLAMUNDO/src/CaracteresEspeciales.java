
public class CaracteresEspeciales {

    public static void main(String args[]) {
        //salto de linea
        var nombre = "Karla";
        System.out.println("nueva linea: \n" + nombre);
        //tabulador
        System.out.println("nueva linea tabulador: \t" + nombre);
        //retroceso
        System.out.println("nueva linea: \b" + nombre);
        //comilla simple y doble
        System.out.println("comilla simple: \'" + nombre + "\'" );
        //COMILLA DOBLE
        System.out.println("comilla doble: \"" + nombre + "\" ");
    }
}
