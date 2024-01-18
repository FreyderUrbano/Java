
public class OperadoresCondicionales {

    public static void main(String args[]) {
        var a = 5;
        var minimo = 0;
        var maximo = 10;
        
        //FORMA DE USO DE OPERADOR AND
        //1ra forma
        if (a >= minimo && a <= maximo) {
            System.out.println(a + " esta en el rango");
        } else {
            System.out.println(a + " esta fuera del rango");
        }

        //2da forma
        var rango = a >= minimo && a <= maximo;
        if (rango) {
            System.out.println(a + " ESTA EN EL RENGO");
        } else {
            System.out.println(a + " NO ESTA EN EL RANGO");
        }
        
        //USO DE OPERADOR OR 
        
        var vacaciones = false;
        var descanso = false;
        
        if (vacaciones || descanso) {
            System.out.println("puede ir ");
        }else{
            System.out.println("no puede ir ");
        }
        

    }
}
