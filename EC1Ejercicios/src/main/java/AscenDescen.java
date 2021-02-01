import java.util.Scanner;
public class AscenDescen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int numFirst = scan.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numSecond = scan.nextInt();
        if(numFirst>numSecond){
            
            for(int i=numFirst; i>=numSecond; i--){
            System.out.println("Serie: " +i);
        }
       }
        else{
            for(int i=numFirst; i<=numSecond; i++){
            System.out.println("Serie: " +i);
        }
    }
        
  }
    
}


