import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int serieFibo = scan.nextInt();
        int valorNum1 = 0;
        int valorNum2 = 1;
        int valTemp;
        System.out.println("Serie: "+valorNum2);
        while (valorNum2+valorNum1 <=serieFibo) {  
            valTemp = valorNum1;
            valorNum1 = valorNum2;
            valorNum2 = valTemp+valorNum1;
            System.out.println("Serie: " +valorNum2);
                  
        }        
        
    }
    
           
        
    
}
