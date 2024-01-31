package PasoPorValor;

public class PasoPorValor {
    //PASO POR VALOR 
    //APLICA A TIPOS PRIMITIVOS
    //se hace la llamada al metodo main
    //se pasa la copia del valor 
    //se crea una variable con un valor 
    //se imprime 
    //y se la envia al metodo cambioValor

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        cambioValor(x);//se envia el valor de x al argumento arg1 
    }
    //se imprime la copia del valor enviado desde el metodo main
    //arg1 debe ser igual a x osea 10
    //arg1 no cambia su valor no se puede 
    public static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1 = 25;//el metodo vambioValor no puede modificar el valor enviado desde main
    }
}
