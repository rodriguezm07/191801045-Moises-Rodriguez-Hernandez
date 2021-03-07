
import java.util.ArrayList;


public class Cine {
    public String nombre;
    public int horaI,horaF,consultaH;
    
    public ArrayList<Pelicula> peliculas = new ArrayList();
    
    public Cine(int consultaH){
        this.consultaH = consultaH;
    
    }
    public Cine(String nombre, int horaI, int horaF, ArrayList<Pelicula> peliculas){
        this.nombre = nombre;
        this.horaI = horaI;
        this.horaF = horaF;
        this.peliculas = peliculas;
    }
    public Cine(String nombre, int horaI, int horaF){
        this.nombre = nombre;
        this.horaI = horaI;
        this.horaF = horaF;
        
    }
    public Cine(int horaI,int horaF){
        this.horaI = horaI;
        this.horaF = horaF;
    }
    public String imprimirPeliculas(){
        String cartelera = "";
        for(Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    }
    //Metodo para agregar peliculas
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public void disponibilidadCine(Cine consulta){
        //int i = consulta.consultaH;
        //int j = cine.horaI;
        //int k = cine.horaF;
        
        int[ ] dispo = new int[14];
        int k=14;
        for(int j=1; j<=k; j++){
            
            int m=24;
            for(int f=10; f<=m; f++){
                dispo[j] = f;
                System.out.println("Arreglo: "+dispo[j]);
            }
            }
        /*for(int j=10; j<=k; j++){
            if(consulta.consultaH == dispo[j]){
                System.out.println("El cine esta abierto");
            }else{System.out.println("El cine esta cerrado");}
                
            }*/
        
    }
    public int peliculasNum(){
        return peliculas.size();
    }
    
    //public int disponibilidadCine(int dispo, int horaI, int horaF){   
    //}
    
    public String menuPelis(){
           String menu = "";
           int i =1;
           menu += "\n Menu Peliculas";
           for(Pelicula pelicula:peliculas){
               menu += "\t" +i+":"+pelicula.titulo+"\n";
               i++;
           }
           return menu;
        
    }
    
    @Override
    public String toString(){
    return "Pelicula: "+nombre;
            
           
            
    }
}
