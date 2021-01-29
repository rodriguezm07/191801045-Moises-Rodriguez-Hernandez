/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class SiEntonces {
    public static void main(String[] args) {
        Scanner readScan = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numRead = readScan.nextInt();
        if(numRead<0){
            System.out.println("El numero es negativo");
      
        }
        else 
            System.out.println("El numero es positivo");
       
        
        
    }
    
}
