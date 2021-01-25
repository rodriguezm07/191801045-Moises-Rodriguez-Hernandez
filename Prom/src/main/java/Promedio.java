
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double number1 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero");
        double number2 = scanner.nextDouble();
        System.out.println("Introduce el tercer numero");
        double number3 = scanner.nextDouble();
        
        double promResult = (number1 + number2 + number3)/3;
        System.out.println("El promedio es: " +promResult);
        
        
    }
    
}
