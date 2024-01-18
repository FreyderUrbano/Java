
public class OperadoresDeAsignacionYRelacionales {

    public static void main(String args[]) {
        var a = 10;
        var b = 15;

        //operador de igualdad
        var c = (a == b);
        System.out.println("c = " + c);//false

        //oprador difente a 
        var d = a != b;
        System.out.println("d = " + d);//true

        var cadena1 = "Adioss";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2;//compara la referencia de la memoria del objeto de la variable 
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2);//comparamos el contenido de las cadenas
        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println(a + " ES PAR");
        } else {
            System.out.println(a + " ES IMPAR");
        }
        
        var edad = 17;
        
        if (edad >= 18) {
            System.out.println("TIENE " + edad + " ES MAYOR DE EDAD");
        }else{
            System.out.println("TIENE " + edad + " ES MENOR DE EDAD");
        }

    }
}
