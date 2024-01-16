
public class VariablesEnJava {
    public static void main(String args[]){
        System.out.println("VARIABLES EN JAVA ");
        //defino la variable
        int numero = 25000;
        //la imprimo
        System.out.println(numero);
        //la modifico
        numero = 30000;
        //la vuelvo a imprimir
        System.out.println(numero);
        
        //cadenas
        
        String miCadena = "cadena de nombres";
        System.out.println(miCadena);
        
        miCadena = "NUEVA CADENA";
        System.out.println(miCadena);
        
        //var - hace inferencias de tipos en java. var toma los tipos de datos ya sea int string o hasta objetos
        
        var variableNumerica = 20;
        var varibleFlotante = 10.00;
        var varibleCadena = "Cadena de caracteres";
        
        System.out.println(variableNumerica);
        System.out.println(varibleCadena);
        System.out.println(varibleFlotante);
        
        //REGLAS PARA DEFINIR EL NOMBRE DE UNA VARIABLE EN JAVA
        //metodos correctos siempre iniciar con minuscula y usar camelcase
        //no se permiten caracters especiales 
        var miNuevaVar = 2;
        var _miNuevaVar = 3;
        var $miNuevaVar = 4;
        
        System.out.println("$miNuevaVar = " + $miNuevaVar);
    }
}
