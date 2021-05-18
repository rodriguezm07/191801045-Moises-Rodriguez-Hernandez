
package Test;
import Clases.Autor;
import Clases.Libro;
import Clases.Lector;
import Clases.Prestamo;
import Clases.Devolucion;

public class Test {
    
    public static void main(String[] args) {
        
        Autor a1 = new Autor("Juan Martinez", "Italiana", "12/05/1978", 1);
        System.out.println(a1);
        
        Libro L1 = new Libro("Cenicienta", "Cuentos", "ACuentame", "CEN8372", 2000, "Juan Martinez");
        System.out.println(L1);
        
        Lector lec1 = new Lector("Monica Mijares", "M", "mon23@gmail.com", 21, 233389904);
        System.out.println(lec1);
        
        Prestamo pres1 = new Prestamo("21/10/2021", "30/10/2021", "Marta Soto", "CEN8372" , 1);
        System.out.println(pres1);
        
        Devolucion dev1 = new Devolucion("30/10/2021", "Marta Soto", "Bien", "No", 1, "CEN8372");
        System.out.println(dev1);
        
        
        
    }
    
}
