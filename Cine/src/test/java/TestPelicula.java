
import java.util.ArrayList;


public class TestPelicula {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Black Widow");
        Pelicula pelicula2 = new Pelicula("Godzilla vs Kong");
        Pelicula pelicula3 = new Pelicula("Love");
        
        //Una lista ligada puede ser de un tipo de variable o de una clase
        ArrayList<Pelicula> peliculas = new ArrayList();
        //Como agregar objetos a una lista ligada
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        //peliculas.size(); Nos regresa el numero de objetos en la lista ligada
        
        System.out.println(peliculas.size());
        for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
        }
    }
    
}
