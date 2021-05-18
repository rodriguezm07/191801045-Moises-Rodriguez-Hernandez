
package Clases;


public class Autor {
    
    protected String nombreA, nacionalidad, fecha;
    protected int id;
    
    public Autor() {
    }

    public Autor(String nombreA) {
        this.nombreA = nombreA;
    }

    
    public Autor(String nombreA, String nacionalidad, String fecha, int id) {
        this.nombreA = nombreA;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
        this.id = id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombreA=" + nombreA + ", nacionalidad=" + nacionalidad + ", fecha=" + fecha + ", id=" + id + '}';
    }

    
    
    
    
}
