/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Planta {
    private int dni;
    private String nombre,nombreC;
    private boolean siEsDeSol, siEsCurativa;
    
    public Planta(){
    
    }
    
    public Planta(int dni, String nombre, String nombreC, boolean siEsDeSol,boolean siEsCurativa){
        this.dni = dni;
        this.nombre = nombre;
        this.nombreC = nombreC;
        this.siEsCurativa = siEsCurativa;
        this.siEsDeSol = siEsDeSol;
    }
    public int getDni(){
        return this.dni;
    } 
    
    public String getNombre(){
        return this.nombre;
    } 
    
    public String getNombreC(){
        return this.nombreC;
    } 
    
    public boolean getSiEsDeSol(){
        return this.siEsDeSol;
    } 
    
    public boolean getSiEsCurativa(){
        return this.siEsCurativa;
    } 
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombreC(String nombreC){
        this.nombreC = nombreC;
    }
    
    public void setSiEsDeSol(boolean siEsDeSol){
        this.siEsDeSol = siEsDeSol;
    }
    
    public void setSiEsCurativa(boolean siEsCurativa){
        this.siEsCurativa = siEsCurativa;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre;
    }
    
    
}
