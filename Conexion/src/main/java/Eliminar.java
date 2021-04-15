
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.sql.*;
import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) throws SQLException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte id de tupla a eliminar: ");
        int id = scan.nextInt();
        
        Usuario user = new Usuario(id);
        DaoUsuarios.eliminar(user);
        /*
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Connect.getConnection();
            
            String sql = "DELETE FROM usuario WHERE id =?";
            
            PreparedStatement declaracion = conexion.prepareStatement(sql);
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a eliminar: ");
            int id = scan.nextInt();
            
            declaracion.setInt(1, id);
            
            declaracion.executeUpdate();
            
            System.out.println("Tupla eliminada");
            
            Connect.close(conexion, declaracion);
            //declaracion.close();
            //conexion.close();
        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        
        */
    }
    
}
