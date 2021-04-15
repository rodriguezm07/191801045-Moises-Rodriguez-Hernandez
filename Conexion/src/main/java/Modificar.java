import Conexion.ConnectUsuarios;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.sql.*;
import java.util.Scanner;


public class Modificar {
    public static void main(String[] args)throws SQLException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar: ");
        int id = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Ingresa nombre de usuario: ");
        String nombre = scan.nextLine();
        System.out.println("Ingresa contraseña: ");
        String contraseña = scan.nextLine();
        System.out.println("\n 1:Activo \n 0:No activo \n Ingresa status: ");
        int status = scan.nextInt();
        
        Usuario user = new Usuario(nombre, contraseña, id, status);
        DaoUsuarios.modificar(user);
        
        /*
        
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Connect.getConnection();
            String sql = "UPDATE usuario SET nombre_usuario =? ,contraseña =?,status =? WHERE id =? ";
            
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a modificar: ");
            int id = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("Ingresa nombre de usuario: ");
            String nombre = scan.nextLine();
            System.out.println("Ingresa contraseña: ");
            String contraseña = scan.nextLine();
            System.out.println("\n 1:Activo \n 0:No activo \n Ingresa status: ");
            int status = scan.nextInt();
            
            
            declaracion.setString(1,nombre);
            declaracion.setString(2,contraseña);
            declaracion.setInt(3, status);
            declaracion.setInt(4, id);
            
            //Ejecutamos el Query
            declaracion.executeUpdate();
            
            System.out.println("Tupla modificada");
            
            //Cerramos las conexiones
            Connect.close(conexion, declaracion);
            //declaracion.close();
            //conexion.close();
        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }
    
}
