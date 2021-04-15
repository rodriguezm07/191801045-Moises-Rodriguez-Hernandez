
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.sql.*;
import java.util.Scanner;


public class Insertar {
    public static void main(String[] args) throws SQLException{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre de usuario: ");
        String nombre = scan.nextLine();
        System.out.println("Inserte contraseña: ");
        String contraseña = scan.nextLine();
        System.out.println("Inserte estatus: ");
        int status = scan.nextInt();
       
        Usuario user = new Usuario(nombre, contraseña, status);
        DaoUsuarios.insertar(user);
        
        
        /*
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Crear conexion con BD
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Connect.getConnection();
            //Crear la instruccion para llamar a los atributos
            String sql = "INSERT INTO usuario(nombre_usuario,contraseña,status) VALUES (?,?,?)";
            //Preparas el Query
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            //Agregar los datos a insertar
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingresa nombre de usuario: ");
            String nombre = scan.nextLine();
            System.out.println("Ingresa contraseña: ");
            String contraseña = scan.nextLine();
            System.out.println("\n 1:Activo \n 0:No activo \n Ingresa status: ");
            int status = scan.nextInt();
            
            //Llamar a la declaracion 
            declaracion.setString(1,nombre);
            declaracion.setString(2,contraseña);
            declaracion.setInt(3, status);
            
            //variable que recibira el resultado de ejecutar la secuencia de SQL 
            declaracion.executeUpdate();
            
            System.out.println("Tupla insertada");
            
            //Cerrar conexiones
            Connect.close(conexion, declaracion);
            //declaracion.close();
            //conexion.close();

        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }
    
}
