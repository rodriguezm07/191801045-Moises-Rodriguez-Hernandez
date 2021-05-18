
package Clases;


public class Lector {
    
    protected String nombre, sexo, correo;
    protected int edad, numT;

    public Lector() {
    }

    public Lector(String nombre, String sexo, String correo, int edad, int numT) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.correo = correo;
        this.edad = edad;
        this.numT = numT;
    }

    @Override
    public String toString() {
        return "Lector{" + "nombre=" + nombre + ", sexo=" + sexo + ", correo=" + correo + ", edad=" + edad + ", numT=" + numT + '}';
    }
    
    
    
}
