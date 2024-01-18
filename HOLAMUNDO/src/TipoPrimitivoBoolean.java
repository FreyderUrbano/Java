
public class TipoPrimitivoBoolean {

    public static void main(String args[]) {
        //almacena los valores de falso y verdadero
        boolean varTipoBoolean = false;
        //son conocidos como valores de tipo bandera 
        System.out.println("varTipoBoolean = " + varTipoBoolean);
        
        if(varTipoBoolean == true){
            System.out.println("la bandera es verdadera");
        }
        else{
            System.out.println("la bandera es falsa");
        }
        
        var edad = 17;
        var esAdulto = edad >= 18;
        
        if (esAdulto) {
            System.out.println("la persona es mayor de edad");
        }
        else{
            System.out.println("la persona es menor de edad " + edad);
        }
        
        
    }
}
