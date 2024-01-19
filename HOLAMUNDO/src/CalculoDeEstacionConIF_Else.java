
import java.util.Scanner;

public class CalculoDeEstacionConIF_Else {

    public static void main(String[] args) {
        //CALCULAR LA ESTACION DEL AÑO CON IF ELSE
        //PEDIR AL USUARIO UN MES Y RESPONDER A QUE ESTACION PERTENECE

        Scanner meses = new Scanner(System.in);

        System.out.println("Escribe un numero de mes: ");

        int nuMes = Integer.parseInt(meses.nextLine());
        var mes = "INGRESA UN NUMERO VALIDO";
        //PASO DE NUMERO A MES
        if (nuMes == 1) {
            mes = "Enero";
        }else if(nuMes == 2){
            mes = "Febrero";
        }else if(nuMes == 3){
            mes = "Marzo";
        }else if(nuMes == 4){
            mes = "Abril";
        }else if(nuMes == 5){
            mes = "Mayo";
        }else if(nuMes == 6){
            mes = "Junio";
        }else if(nuMes == 7){
            mes = "Julio";
        }else if(nuMes == 8){
            mes = "Agosto";
        }else if(nuMes == 9){
            mes = "Septiembre";
        }else if(nuMes == 10){
            mes = "Octubre";
        }else if(nuMes == 11){
            mes = "Noviembre";
        }else if(nuMes == 12){
            mes = "Diciembre";
        }else {
            mes = "Error";
        }
        System.out.println("El numero digitado "+ nuMes + " corresponde al mes: " + mes);
        
        //CALCULO DE ESTACION
        
        var estacion = "No existe esta estacion";
        
        if(mes == "Marzo" || mes == "Abril" || mes == "Mayo" || mes == "Junio"){
            estacion = "Primavera";
        }else if(mes == "Julio" || mes == "Agosto" || mes == "Septiembre"){
            estacion = "Verano";
        }else if(mes == "Octubre" || mes == "Noviembre" || mes == "Diciembre"){
            estacion = "Otono";
        }else if(mes == "Enero" || mes == "Febrero"){
            estacion = "Invierno";
        }
            

        if (nuMes >= 3 && nuMes <= 6) {
            System.out.println("Para el mes de " + mes + " la estacion es: " + estacion);
        } else if (nuMes >= 6 && nuMes <= 9) {
            System.out.println("Para el mes de " + mes + " la estacion es: " + estacion);
        } else if (nuMes >= 10 && nuMes <= 12) {
            System.out.println("Para el mes de " + mes + " la estacion es: " + estacion);
        } else if (nuMes >= 1 && nuMes <= 2) {
            System.out.println("Para el mes de " + mes + " la estacion es: " + estacion);
        } else {
            System.out.println(mes);
        }

    }
}
