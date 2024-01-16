
import java.util.Scanner;

public class UsoDeClaseScannerJava {

    public static void main(String args[]) {

        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);

        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe tu profesion: ");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);
        
        System.out.println(" La persona: " + usuario + " tiene como profesion: " + titulo);
    }
}
