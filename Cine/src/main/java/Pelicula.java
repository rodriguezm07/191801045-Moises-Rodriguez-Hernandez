

public class Pelicula {
    public String titulo,director,genero,productora,clasificacion,subtitulos;
    public int año;
    public double duracion;
    
    
    public Pelicula(){
    
    }
    public Pelicula(String titulo, String director, String genero, String productora, String clasificacion,String subtitulos, int año, double duracion){
        this.año = año;
        this.clasificacion = clasificacion;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.productora = productora;
        this.subtitulos = subtitulos;
        this.titulo = titulo;
        
        
        
    }
    
    public Pelicula(String titulo){
        this.titulo = titulo;
        
    }
    
    @Override
    public String toString(){
    return "Nombre: "+titulo+ "\n Director: "+director+ "\n Genero: "+genero+ "\n Productora: "+productora+ "\n Clasificacion: "+clasificacion+ "\n Año: "+año+ "\n Duracion: "+duracion+ "\n Subtitulos: "+subtitulos;
    }
    
    
}
