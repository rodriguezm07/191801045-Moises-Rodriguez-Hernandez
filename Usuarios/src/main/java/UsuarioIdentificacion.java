
public class UsuarioIdentificacion {
    private String  curp,rfc,usuarioDomicilio;
    private int edad,id;
    

    public UsuarioIdentificacion() {
    }

    public UsuarioIdentificacion(String curp, String rfc, String usuarioDomicilio, int edad, int id) {
        this.curp = curp;
        this.rfc = rfc;
        this.usuarioDomicilio = usuarioDomicilio;
        this.edad = edad;
        this.id = id;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getUsuarioDomicilio() {
        return usuarioDomicilio;
    }

    public void setUsuarioDomicilio(String usuarioDomicilio) {
        this.usuarioDomicilio = usuarioDomicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UsuarioIdentificacion{" + "curp=" + curp + ", rfc=" + rfc + ", usuarioDomicilio=" + usuarioDomicilio + ", edad=" + edad + ", id=" + id + '}';
    }
    
    

    
    
    
}
