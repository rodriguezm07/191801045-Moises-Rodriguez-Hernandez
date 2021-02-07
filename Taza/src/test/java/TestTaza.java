
public class TestTaza {
    public static void main(String[] args) {
        //Crear un objeto(Instanciar una clase)
        Taza tazaRoja = new Taza();
        tazaRoja.color = "Roja";
        tazaRoja.modelo = "Navideña";
        tazaRoja.material = "Porcelana";
        tazaRoja.tamanio = "Chica";
        tazaRoja.precio = 15;
        
        System.out.println(tazaRoja);
        
        Taza tazaNaranja = new Taza("Naranja", "Primavera", "Barro", 50, "Mediana" );

        System.out.println(tazaNaranja);
        
    }
    
}
