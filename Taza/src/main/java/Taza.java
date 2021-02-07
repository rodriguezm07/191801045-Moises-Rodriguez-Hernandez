
public class Taza {
   
    //Atributos 
    public String color,modelo,material,tamanio;
    public double precio;
    
    //Metodos
    //Constructores
    public Taza(String color, String modelo, String material, double precio, String tamanio){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio =  precio;
        this.tamanio = tamanio;
    }
    public Taza(){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.precio =  0;
        this.tamanio = "";
    }
    //Metodo toString
    @Override
    public String toString(){
        return "El color de la taza es de: " +color+ "\n el nombre del modelo es: " +modelo+ "\n el material es de: " +material+ "\n el tamaño es de: "+tamanio+ "\n con un precio de: "+precio;
        
    }
    
    
}
