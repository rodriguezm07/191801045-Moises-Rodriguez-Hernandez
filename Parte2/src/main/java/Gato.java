
public class Gato extends Mascota {

    public void vacunar(){
    
    }
    
    public static void main(String[] args) {
        Gato obj = new Gato();
        obj.vacunar();
        obj.hacerRuido();
        obj.comer();
        obj.dormir();
        obj.respirar();
    }
    @Override
    public void hacerRuido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
