package PasoPorReferencia;

import Clases.Persona;
//PASO POR REFERENCIA

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Freyder";
        persona1.apellido = "Urbano";
        System.out.println("Nombre Inicial = " + persona1.nombre + " " + persona1.apellido);
        persona1 = cambioValor(persona1);//se para los datos de persona1 como argumento a el metodo cambio valor
        System.out.println("Variable persona1 con cambio de Nombre: " + persona1.nombre + " " + persona1.apellido);

    }

    //es importante entender que los objetos se pueden acceder desde otros metodos y modificar sus atributos 
//    public static void cambioValor(Persona persona) {
//        persona.nombre = "Alejandro";//cuando se trabaja con objetos si se peueden modificar sus datos 
//        persona.apellido = "Rosales";
//    }
    //uso de return en java
    //se cambia el metodo void por Object en este caso el objeto Persona
    public static Persona cambioValor(Persona persona) {
        persona.nombre = "Alejandro";//cuando se trabaja con objetos si se peueden modificar sus datos 
        persona.apellido = "MAradona";
        return persona;//regresa valores de objetos no solo de tipos primitivos como int 
    }
}
