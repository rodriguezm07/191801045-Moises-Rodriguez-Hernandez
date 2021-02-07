
public class Cancion {
    
    //Crear atributos 
    public int orden;
    public String titulo;
    public double duracion;
    
    //Metodos
    //Constructor lleno
    public Cancion(String titulo,double duracion,int orden){
        this.duracion = duracion;
        this.titulo = titulo;
        this.orden = orden;
    }
    
    //Constructor
    public Cancion(){
    
    }
    
    @Override
    public String toString(){
        return "El nombre de la cancion" +titulo+ "\n duracion: " +duracion+ "\n orden: " +orden;
        
    }
  
}
