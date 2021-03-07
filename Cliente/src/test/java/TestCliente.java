
public class TestCliente {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Ferrari","Rojo", 3000000, 12213443,2020);
        Cliente cliente1 = new Cliente("EWUR12", "Juan", "Juan128@gmail.com", 9381743, coche1);
        System.out.println(cliente1);
        
    }
    
}
