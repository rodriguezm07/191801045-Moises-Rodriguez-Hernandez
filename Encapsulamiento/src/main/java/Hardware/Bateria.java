package Hardware;


public class Bateria {
    
    private int porcentaje;
    
    public int getPorcentaje(){
        return this.porcentaje;
    }
    public void setPorcentaje(int porcentaje){
        this.porcentaje = porcentaje;
    }
    public Bateria(){
        this.porcentaje = 100;
        
    }
    public Bateria(int porcentaje){
        this.porcentaje = porcentaje;
    }
    
    @Override
    public String toString(){
        return "Porcentaje: "+porcentaje;
    }
}
