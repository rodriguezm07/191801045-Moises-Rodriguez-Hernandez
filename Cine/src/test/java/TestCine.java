
//import java.util.ArrayList;
import java.util.Scanner;

public class TestCine {
    public static void main(String[] args) {
        
        
        Cine cine = new Cine("Cinepolis", 10,24);
       
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(i!=5){
        
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Total de peliculas en cartelera");
            System.out.println("3. Menu de peliculas");
            System.out.println("4. Disponibilidad Cine");
            System.out.println("5. Salir");
            
            System.out.println("Opcion: ");
            int opcion = scan.nextInt();
            i = opcion;
            switch(opcion){
                
                case 1:
                    System.out.println("Ingresa el titulo de la pelicula: ");
                    scan.nextLine();
                    String titulo = scan.nextLine();
                    Pelicula pelicula = new Pelicula(titulo);
                    cine.agregarPelicula(pelicula);
                    
                    break;
                case 2:
                    System.out.println(cine.peliculasNum());
                    break;
                case 3:
                    System.out.println(cine.menuPelis());
                    break;
                case 4:
                    System.out.println("Ingrese hora consulta: ");
                    scan.nextLine();
                    int consultaH = scan.nextInt();
                    Cine consulta = new Cine(consultaH);
                    cine.disponibilidadCine(consulta);
                   
                    

                    break;
                case 5:
                    
                
                    break;
                    
                default:
                    break;
            
            }
            
            
            
        
        }
        
    }
}
    
		

	
        
    

    


