import java.util.*;




public class Promedio {

    public static void main(String args[]){
        
        System.out.println("Introduce 3 numeros a promediar");
        
        
        Scanner.scanner = new Scanner (System.in);
        
        double number1 = Scanner.nextdouble();
        double number2 = Scanner.nextdouble();
        double number3 = Scanner.nextdouble();
        
        double promResult = (number1 + number2 + number3)/3;
        System.out.println("El promedio es: " +promResult);
        
        
    
    
    }
}
