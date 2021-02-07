import java.util.Scanner;
public class TestMaterias {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introcuce datos de una materia");
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Carrera: ");
        String carrera = scan.nextLine();
        System.out.println("Creditos: ");
        int creditos = scan.nextInt();
        System.out.println("Codigo: ");
        String codigo = scan.nextLine();
        System.out.println("Cuatrimestre: ");
        int cuatrimestre = scan.nextInt();

        Materias español = new Materias("Españos","Financiera","FN123",10, 1);
        Materias matematicas = new Materias("Matematicas","Mecatronica", "MEC123", 15, 3);
        Materias ciencias = new Materias("Ciencias", "Biotecnologia", "BIO123", 20, 2);
        Materias materias = new Materias(nombre, carrera, codigo, creditos, cuatrimestre);
        
        System.out.println(español+ "\n" +matematicas+ "\n" + ciencias+ "\n" +materias);
        
    }
    
}
