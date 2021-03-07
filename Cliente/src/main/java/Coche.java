
public class Coche {
    

    public String marca,color;
    double precio;
    int matricula,modelo;
    
    public Coche(){
    
    }
    
    public Coche(String marca, String color, double precio, int matricula, int modelo){
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.precio = precio;
        
    }
   
    @Override
    public String toString(){
        return "\n Color: "+color+"\n Marca: "+marca+"\n Matricula: "+matricula+"\n Modelo: "+modelo+"\n Precio: "+precio;
    }
    
    
}

    
