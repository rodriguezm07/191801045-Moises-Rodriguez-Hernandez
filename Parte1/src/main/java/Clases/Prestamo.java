
package Clases;


public class Prestamo extends Libro {
    
    protected String fechaP, fechaD, nombreL;
    protected int id;

    public Prestamo() {
    }

    public Prestamo(String fechaP, String fechaD, String nombreL, String clave, int id) {
        super(clave);
        this.fechaP = fechaP;
        this.fechaD = fechaD;
        this.nombreL = nombreL;
        this.id = id;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaD() {
        return fechaD;
    }

    public void setFechaD(String fechaD) {
        this.fechaD = fechaD;
    }

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaP=" + fechaP + ", fechaD=" + fechaD + ", nombreL=" + nombreL + ", id=" + id + "Clave: " +clave;
    }

    

    
    
    
    
    
    
    
    
}
