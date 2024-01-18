
public class OpradoresUnariosEnJava {

    public static void main(String args[]) {
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // operador unario de negacion !variable// solo aplica para booleanos
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento 2 variantes: preincremento e incremento
        // preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa su variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //posincremento (simbolo despues de la variable)
        
        var g = 5;
        var h = g++;//primero se usa el valor de la variable g y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremeneto 
        //predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);
        
        //posdecremento
        
        var k = 3;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        
        
        
    }
}
