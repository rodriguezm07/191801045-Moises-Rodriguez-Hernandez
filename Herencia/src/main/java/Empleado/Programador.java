
package Empleado;


public class Programador extends Empleado{
    private double sueldo;
    
    public Programador(){
        super();
        this.sueldo = 0;
    }
    
    public Programador(String nombre, String apellidoP, String apellidoM, int dni, double sueldo){
        super(nombre, apellidoP, apellidoM, dni);
        this.sueldo = sueldo;
        
    }
    
    @Override
    public String toString(){
        return "Sueldo: " +sueldo+ "Nombre: "+super.toString();
    }
    
}
