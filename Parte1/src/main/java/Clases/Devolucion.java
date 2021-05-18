
package Clases;


public class Devolucion extends Libro{
    
    protected String fechaD, nombreL, estado, multa;
    protected int id;

    public Devolucion() {
    }

    public Devolucion(String fechaD, String nombreL, String estado, String multa, int id, String clave) {
        super(clave);
        this.fechaD = fechaD;
        this.nombreL = nombreL;
        this.estado = estado;
        this.multa = multa;
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
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
        return "Devolucion{" + "fechaD=" + fechaD + ", nombreL=" + nombreL + ", estado=" + estado + ", multa=" + multa + ", id=" + id + "Clave: "+clave;
    }
    
    
}
