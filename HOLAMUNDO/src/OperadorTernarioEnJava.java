
public class OperadorTernarioEnJava {

    public static void main(String args[]) {
        var res = (3 > 2) ? "FALSE" : "VERDADERO";
        System.out.println(res);

        //uso
        var numero = 5;
        res = (numero % 2 == 0) ? numero + " ES PAR" : numero + " ES IMPAR";
        System.out.println("res = " + res);
    }
}
