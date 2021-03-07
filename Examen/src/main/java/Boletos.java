
public class Boletos {
    private String nombreP;
    private double precio;
    private int sala,hora,minutos;
    
    
    public Boletos(){
    
    }
    
    public Boletos(String nombreP, double precio, int sala, int hora, int minutos){
        this.nombreP = nombreP;
        this.precio = precio;
        this.sala = sala;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    
    @Override
    public String toString(){
    return "\n Nombre de la pelicula: "+nombreP+"\n Precio: "+precio+"\n Sala: "+sala+"\n Hora: "+hora+ "\n Minutos: "+minutos;
    }
    
}
