
public class JabonZote {
    //Creacion de atributos
    public String nombre,area,color,clave;
    public double precio;
    
    //Creacion de metodos
    
    //Constructor vacio
    public JabonZote(){
    
    }
    //Constructor lleno
    public JabonZote(String nombre, String area, String color, String clave, double precio){
        this.area = area;
        this.clave = clave;
        this.color = color;
        this.nombre = nombre;
        this.precio = precio;
    
    }
    //Constructor toString 
    @Override
    public String toString(){
    
        return "Nombre del producto: "+nombre+ "\n Precio: "+precio+ "\n Area: "+area+ "\n Color: "+color+ "\n Clave: "+clave;
    }
    
}
