import java.util.Scanner;
public class TestJabonZote {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce datos del producto");
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Precio: ");
        double precio = scan.nextDouble();
        System.out.println("Area: ");
        String area = scan.nextLine();
        area = scan.nextLine();
        System.out.println("Color: ");
        String color = scan.nextLine();
        System.out.println("Clave: ");
        String clave = scan.nextLine();
        
        //Crear objeto(Instanciar una clase)
        JabonZote product1 = new JabonZote("Zote lavanda", "Limpieza", "Azul", "ZOT123", 25.99);
        JabonZote productN = new JabonZote(nombre, area, color, clave, precio);
        
        System.out.println(product1+ "\n" +productN);
        
    }
    
}
