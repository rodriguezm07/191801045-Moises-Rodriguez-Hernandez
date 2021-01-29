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
public class CicloFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero de la serie");
        int serie = scan.nextInt();
        
        for(int i=0; i<serie; i++){
            System.out.println("Serie: " +i);
        }
        int j=serie;
        while (j>=0) {            
            System.out.println("Serie: " +j);

            j--;            
        }        
        
    }
    
}
