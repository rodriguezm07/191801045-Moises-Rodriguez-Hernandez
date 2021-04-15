
import java.util.Scanner;


public class Fisica {
    public static void main(String[] args) {
        
        final int cons =2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el valor altura");
        double altura = scan.nextInt();
        double result = altura/cons;
        System.out.println("El valor de X: "+result);
        
        System.out.println("Introduce el valor altura");
        double altura2 = scan.nextInt();
        double result2 = (altura-altura2)/cons;
        System.out.println("El resultado de H: "+result2);
        
    }
    
          
}
