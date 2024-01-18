
public class TiposPrimitivosDeTipoFlotante {
    public static void main(String args[]){
        
        //varias formas para definir un numero de tipo flotante
        float numeroFloat = 10.0f;
        float numFloat = (float)10.0;
        
        System.out.println(numeroFloat);
        System.out.println("MINVALUE: " + Float.MIN_VALUE);
        System.out.println("MAXVALUE: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("maximo numeroDouble = " + Double.MAX_VALUE);
        System.out.println("minimo numeroDouble = " + Double.MIN_VALUE);
        
    }
}
