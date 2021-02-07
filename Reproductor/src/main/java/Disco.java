
import java.util.ArrayList;


public class Disco {
    public String nombre, artista;
    public int anio;
    public ArrayList<Cancion> canciones;
    
    //Constructor vacio
    public Disco(){
    
            
    }
    
    //Constructor completo
    public Disco(String nombre, String artista, int anio, ArrayList<Cancion> canciones){
        
        this.anio = anio;
        this.artista = artista;
        this.canciones = canciones;
        this.nombre = nombre;
    } 
    
    //Metodo toString
    @Override
    public String toString(){
        return "Nombre del disco: "+nombre+ "\n Nombre del artista: "+artista+ "\n Año de publicacion: "+anio+ "\n" +canciones;
        
    }

    
    
}
