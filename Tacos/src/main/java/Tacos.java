import java.util.Scanner;


public class Tacos {
    public static void main(String[] args) {
        
        System.out.println("Cuantos tacos consumio?:");
        Scanner scan = new Scanner(System.in);
        int tacosNum = scan.nextInt();
        int i=0;
        int j=0;
        int suma1 = 0;
        int suma2 = 0;
        while(i<tacosNum){  
        int precioTaco = 17;
        suma1 += precioTaco; 
        i++;  
    }  
        System.out.println("Cuantos refresco consumio?:");
        int refrescosNum = scan.nextInt();
        while(j<refrescosNum){  
        int precioRefresco = 10;
        suma2 += precioRefresco; 
        j++;  
    }
        System.out.println("La suma total de la cuenta es:  " +(suma1+suma2));
                
    }
    
}
