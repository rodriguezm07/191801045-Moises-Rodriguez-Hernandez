
public class AgregarPeliculas {
    public static void main(String[] args) {
        Cine cine = new Cine("Cinepolis", 10, 12);
        Pelicula pelicula = new Pelicula("Godzilla");
        cine.agregarPelicula(pelicula);
        System.out.println(cine);
        
        System.out.println(cine.menuPelis());
       
    }
    
}
