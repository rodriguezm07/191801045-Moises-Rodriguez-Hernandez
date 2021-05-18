
public class Pez extends Mascota{

    public void nadar(){
    
    }
    
    public static void main(String[] args) {
        Pez obj = new Pez();
        obj.nadar();
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
