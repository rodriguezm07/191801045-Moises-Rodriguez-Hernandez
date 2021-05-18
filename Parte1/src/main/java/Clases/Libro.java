
package Clases;


public class Libro extends Autor {
    
    protected String nombre,tipo, editorial, clave;
    protected int año;

    public Libro() {
    }

    public Libro(String clave) {
        this.clave = clave;
    }

    public Libro(String nombre, String tipo, String editorial, String clave, int año, String nombreA) {
        super(nombreA);
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.clave = clave;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", clave=" + clave + ", a\u00f1o=" + año + nombreA + "Nombre autor = ";
    }
    
    
    

    
    
    
}
