import java.util.Scanner;
public class SeriePar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numPar = scan.nextInt();
        for(int i=0; i<=numPar; i++){
            if(i%2==0)
            System.out.println("Serie: " +i);
        }
    }
    
}
