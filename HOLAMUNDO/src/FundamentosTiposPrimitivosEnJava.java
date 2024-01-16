
import java.util.logging.Logger;

public class FundamentosTiposPrimitivosEnJava {

    public static void main(String args[]) {
        /*
        TIPOS PRIMITIVOS ENTEROS: byte, short, long
         */

        byte tipobyte = 10;
        System.out.println("tipo: " + tipobyte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo " + Byte.MAX_VALUE);

        short numeroShort = 10;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);

        long numeroLong = 10;

        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo Long: " + Long.MIN_VALUE);
        System.out.println("valor maximo Long: " + Long.MAX_VALUE);

        int numeroInt = 10;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo Int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo Int: " + Integer.MAX_VALUE);

    }

}
