package PalabraThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Freyder", "Perez");
        System.out.println("persona = " + persona.nombre + " " + persona.apellido );
        
    }
}
//se crea la clase Persona
//primero sus atributos 
//luego el constructor del objeto persona para tomar los atributos
class Persona{
    String nombre;
    String apellido;
    
    //CONSTRUCTOR CON ARGUMENTOS
    Persona(String nombre, String apellido){
        super();//llama al constructor de la clase padre (object)
        nombre = this.nombre = nombre;
        apellido = this.apellido = apellido;
        var na = nombre + " " + apellido;
        System.out.println("na = " + na);
        //otra forma de imprimr el objeto persona 
        System.out.println("Objeto persona: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("imprimir: " + persona);
        System.out.println("imprimir usando this: " + this);
    }
}

