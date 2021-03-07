/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author rodri
 */
public class Empleado {
    private String nombre,apellidoP,apellidoM;
    private int dni;
    
    
    
    public Empleado(){
    
    }
    
    public Empleado(String nombre, String apellidoP, String apellidoM, int dni){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.dni = dni;
    }
    
    @Override 
    public String toString(){
        return "\n Nombre: "+nombre+ "\n Apellido Paterno: "+apellidoP+ "\n Apellido Materno: "+apellidoM+"\n DNI: "+dni;
    }
}
