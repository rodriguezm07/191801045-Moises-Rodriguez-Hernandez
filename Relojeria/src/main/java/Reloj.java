/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Reloj {
    public String marca;
    public double precio;
    public boolean analogo,digital;

    public Reloj() {
    }

    public Reloj(String marca, double precio, boolean analogo, boolean digital) {
        this.marca = marca;
        this.precio = precio;
        this.analogo = analogo;
        this.digital = digital;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAnalogo() {
        return analogo;
    }

    public void setAnalogo(boolean analogo) {
        this.analogo = analogo;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }
    

    @Override
    public String toString() {
        return "Reloj{" + "marca=" + marca + ", precio=" + precio + ", analogo=" + analogo + ", digital=" + digital + '}';
    }
    
    
    
}
