
import java.util.Scanner;

public class EcuacionPrimerGrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca valor de B");
        double valorB = scan.nextInt();
        System.out.println("Introduza valor de A");
        double valorA = scan.nextInt();
        if(valorB<0){
            double resultNum1 = (valorB /valorA)*-1;
           
            System.out.println("El valor de X:" +resultNum1);
        }
        else if(valorA<0){
            double resultNum2 = (valorB/valorA)*-1;
            System.out.println("El valor de X:" +resultNum2);
        }
        else{
            double resultNum2 = (valorB/valorA)*-1;
            System.out.println("El valor de X:" +resultNum2);
        } 
            
        
        
    }
    
}
