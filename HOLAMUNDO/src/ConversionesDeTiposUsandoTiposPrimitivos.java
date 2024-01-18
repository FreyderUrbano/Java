
import java.util.Scanner;

public class ConversionesDeTiposUsandoTiposPrimitivos {

    public static void main(String args[]) {
        //convertir tipo string a int
        //se usa la clase Integer y la propiedad parseInt para convertir de string a int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        //convertir de string a double
        var num = Double.parseDouble("3.1416");
        System.out.println("num = " + num);

        //pedir un valor con scanner
        var consola = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        //convertir un int a string
        
        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);
        
        //recuperar un caracter de una cadena
        //charAt solicita el indice de los caracteres de la cadena hola
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);// imprime h
        
        System.out.println("Proporcion un caracter: ");
        caracter = consola.nextLine().charAt(0);// el metodo nextLine recupera cadenas sin importar que sean numero o letras
        System.out.println("caracter = " + caracter);
        
        
    }
}
