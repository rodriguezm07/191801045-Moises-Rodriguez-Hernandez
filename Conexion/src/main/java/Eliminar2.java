import Conexion.ConnectUsuarios;
import java.sql.*;
import java.util.Scanner;

public class Eliminar2 {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Connection conexion2 = DriverManager.getConnection(url,"root","");
            Connection conexion2 = ConnectUsuarios.getConnection();
            
            String sql = "DELETE FROM usuarioidentificacion WHERE id =?";
            
            PreparedStatement declaracion = conexion2.prepareStatement(sql);
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a eliminar: ");
            int id = scan.nextInt();
            
            declaracion.setInt(1, id);
            
            declaracion.executeUpdate();
            
            System.out.println("Tupla eliminada");
            
            ConnectUsuarios.close(conexion2, declaracion);
            //declaracion.close();
            //conexion2.close();
        
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}
