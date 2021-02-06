
public class Ak {
    
    //Atributos 
    public String material,disponibilidad;
    public int municion;
    public double velocidadDisparo, danio, precio;
    
    //Metodos
    public String mostrarCaracteristicas(){
        return "El material del arma es de: " +material+ "\n con una disponibilidad de: " +disponibilidad+ "\n con una municion de: " +municion+ "\n con una velocidad de disparo: "+velocidadDisparo+ "\n con un danio de: "+danio+ "\n y con un precio de: "+precio;
        
    }
    
    
}
