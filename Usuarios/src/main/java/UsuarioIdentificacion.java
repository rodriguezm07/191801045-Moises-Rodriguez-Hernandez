/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class UsuarioIdentificacion {
    private String  curp,rfc,nombre,oficio,edad;

    public UsuarioIdentificacion() {
    }

    public UsuarioIdentificacion(String curp, String rfc, String nombre, String oficio, String edad) {
        this.curp = curp;
        this.rfc = rfc;
        this.nombre = nombre;
        this.oficio = oficio;
        this.edad = edad;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "UsuarioIdentificacion{" + "curp=" + curp + ", rfc=" + rfc + ", nombre=" + nombre + ", oficio=" + oficio + ", edad=" + edad + '}';
    }
    
    
    
}
