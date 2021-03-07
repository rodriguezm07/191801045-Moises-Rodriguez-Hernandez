
import Hardware.Bateria;

public class TestBateria {

    public static void main(String[] args) {
        Bateria bat = new Bateria(75);
        System.out.println(bat);

        bat.setPorcentaje(50);
        System.out.println(bat);
    }

}
