
import java.util.Scanner;

public class EstacionesDelAnoConSwitch {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int nuMes = Integer.parseInt(consola.nextLine());
        var estacion = "Error estacion";
        var mes = "Mes erroneo";

        if (nuMes == 0) {
            System.out.println("NUMERO NO VALIDO");
        } else if (nuMes == 1) {
            mes = "Enero";
            estacion = "Inverno";
        } else if (nuMes == 2) {
            mes = "Febrero";
            estacion = "Inverno";
        } else if (nuMes == 3) {
            mes = "Marzo";
            estacion = "Inverno";
        } else if (nuMes == 4) {
            mes = "Abril";
            estacion = "Primavera";
        } else if (nuMes == 5) {
            mes = "Mayo";
            estacion = "Primavera";
        } else if (nuMes == 6) {
            mes = "Junio";
            estacion = "Primavera";
        } else if (nuMes == 7) {
            mes = "Julio";
            estacion = "Verano";
        } else if (nuMes == 8) {
            mes = "Agosto";
            estacion = "Verano";
        } else if (nuMes == 9) {
            mes = "Septiembre";
            estacion = "Verano";
        } else if (nuMes == 10) {
            mes = "Octubre";
            estacion = "Otono";
        } else if (nuMes == 11) {
            mes = "Noviembre";
            estacion = "Otono";
        } else if (nuMes == 12) {
            mes = "Diciembre";
            estacion = "Otono";
        } else if (nuMes > 12) {
            System.out.println("INGRESE UN NUMERO VALIDO");
        }

        switch (nuMes) {
            case 1:
            case 2:
            case 3:
                System.out.println("El mes elegido para el numero escrito es: " + mes + " la estacion para este numero es: " + estacion);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("El mes elegido para el numero escrito es: " + mes + " la estacion para este numero es: " + estacion);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("El mes elegido para el numero escrito es: " + mes + " la estacion para este numero es: " + estacion);
                break;
            case 11:
            case 12:
                System.out.println("El mes elegido para el numero escrito es: " + mes + " la estacion para este numero es: " + estacion);
                break;
            default:
                throw new AssertionError();
        }
    }

}
