
import java.util.Scanner;

public class OperadorTernarioEnJava {

    public static void main(String args[]) {
        var res = (3 > 2) ? "FALSE" : "VERDADERO";
        System.out.println(res);

        //uso
        var numero = 5;
        res = (numero % 2 == 0) ? numero + " ES PAR" : numero + " ES IMPAR";
        System.out.println("res = " + res);

        //uso con if-else
        //solicitud por consola
        System.out.println("Escribe un numero: ");
        Scanner consola = new Scanner(System.in);

        var numeroIf = Integer.parseInt(consola.nextLine());
        System.out.println("numeroIf = " + numeroIf);
        
        if (numeroIf % 2 == 0) {
            System.out.println(numeroIf + " ES PAR");
        }
        else{
            System.out.println(numeroIf + " ES IMPAR");
        }

    }
}
