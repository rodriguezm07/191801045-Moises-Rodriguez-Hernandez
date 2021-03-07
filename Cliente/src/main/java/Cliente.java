
public class Cliente {
    public String dni,nombre,correo;
    int telefono;
    public Coche coche;
    
    
    public Cliente(){
    
    }
    
    public Cliente(String dni, String nombre, String correo, int telefono, Coche coche){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.coche = coche;
        
    }
    
    @Override
    public String toString(){
        return "\n DNI: "+dni+"\n Nombre:"+nombre+"\n Telefono: "+telefono+"\n Correo: "+correo+ "\n Informacion del auto "+coche;
    }
}
