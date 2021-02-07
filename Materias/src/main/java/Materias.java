
public class Materias {
    
    //Crear atributos
    public String nombre,carrera,codigo;
    public int creditos,cuatrimestre;
    
    //Crear metodos
    //Constructor vacio
    public Materias(){
    
    }
    //Constructor lleno
    public Materias(String nombre, String carrera, String codigo, int creditos, int cuatrimestre){
        this.carrera = carrera;
        this.codigo = codigo;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
        this.nombre = nombre;
    
    }
    //Constructor toString
    @Override
    public String toString(){
    
    return "Nombre de la materia"+nombre+ "\n Nombre de la carrera: "+carrera+ "\n Codigo de la materia: "+codigo+ "\n Numero de creditos: " +creditos+ "\n Nombre del cuatrimestre: " +cuatrimestre;
    }
    
    
    
}
