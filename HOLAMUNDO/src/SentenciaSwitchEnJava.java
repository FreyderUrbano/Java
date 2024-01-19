
import java.util.Scanner;

public class SentenciaSwitchEnJava {

    public static void main(String[] args) {
        //CONVERTIR UN NUMERO A TEXTO
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe un numero: ");

        int numero = Integer.parseInt(consola.nextLine());

        var texto = "error en rango";

        switch (numero) {
            case 1:
                System.out.println(texto = "numero uno");
                break;
            case 2:
                System.out.println(texto = "numero dos");
                break;
            case 3:
                System.out.println(texto = "numero tres");
                break;
            case 4:
                System.out.println(texto = "numero cuatro");
                break;
            default:
                System.out.println(texto);
        }

    }

}
