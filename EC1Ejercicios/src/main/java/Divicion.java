
import java.util.Scanner;

public class Divicion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el divisor");
        double divisorNum = scan.nextDouble();
        System.out.println("Introduzca el dividendo");
        double dividendoNum = scan.nextDouble();
        
        if((dividendoNum>divisorNum)&& (dividendoNum % divisorNum ==0)){
            System.out.println("La suma es exacta y es viable");
        }
        else{
            System.out.println("La suma no es exacta, pero es viable");
        }
    }
    
}
