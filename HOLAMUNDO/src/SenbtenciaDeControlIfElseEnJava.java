
public class SenbtenciaDeControlIfElseEnJava {

    public static void main(String[] args) {
        var condicion = true;

        if (condicion) {
            System.out.println("la condicion en verdadera");
        } else {
            System.out.println("la condicion es falsa");
        }

        var numero = 20;
        var numeroTexto = "desconocido";

        if (numero <= 10) {
            System.out.println("El numero " + numero + " esta en el rango");
        } else {
            System.out.println(numeroTexto);
        }
    }
}
