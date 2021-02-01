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
public class LitrosMililitros {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el valor en litros");
        double litrosAgua = scan.nextDouble();
        double resultWater = litrosAgua *1000;
        System.out.println("La cantidad en litros: " +litrosAgua + "\n Su equivalente en mililitros es: " +resultWater);
    }
}
