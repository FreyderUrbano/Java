
public class OperadoresAritmeticos {

    public static void main(String args[]) {
        int a = 5, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado divicion = " + resultado);

        //residuo modulo
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

//VALIDAR SI UN NUMERO ES PAR O IMPAR
        if (a % 2 == 0) {
            System.out.println(a + " ES PAR");
        } else {
            System.out.println(a + " ES IMPAR");
        }

    }
}
