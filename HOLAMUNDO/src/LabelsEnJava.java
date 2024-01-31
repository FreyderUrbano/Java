
public class LabelsEnJava {

    public static void main(String[] args) {

        inicio://etiqueta inicio 
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }

//        inicio://etiqueta inicio 
//        for (var contador = 0; contador < 10; contador++) {
//            if (contador % 2 != 0) {
//                System.out.println("contador = " + contador);
//                break inicio;
//            }
//            
//        }
    }

}
