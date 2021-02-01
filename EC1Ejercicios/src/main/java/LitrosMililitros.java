
import java.util.Scanner;

public class LitrosMililitros {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el valor en litros");
        double litrosAgua = scan.nextDouble();
        double resultWater = litrosAgua *1000;
        System.out.println("La cantidad en litros: " +litrosAgua + "\n Su equivalente en mililitros es: " +resultWater);
    }
}
