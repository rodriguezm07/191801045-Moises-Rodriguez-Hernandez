import Conexion.ConnectUsuarios;
import java.sql.*;
import java.util.Scanner;

public class Modificar2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Connection conexion2 = DriverManager.getConnection(url,"root","");
            Connection conexion2 = ConnectUsuarios.getConnection();
            
            String sql = "UPDATE usuarioidentificacion SET usuario_domicilio =?,rfc =?,edad =?,curp =? WHERE id =?";
            
            PreparedStatement declaracion = conexion2.prepareStatement(sql);
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese id de tupla a modificar: ");
            int id = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("Ingrese domicilio: ");
            String domicilio = scan.nextLine();
            System.out.println("Ingrese RFC: ");
            String rfc = scan.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("Ingrese CURP: ");
            String curp = scan.nextLine();
            
            declaracion.setString(1,domicilio);
            declaracion.setString(2,rfc);
            declaracion.setInt(3, edad);
            declaracion.setString(4,curp);
            declaracion.setInt(5, id);
                    
            declaracion.executeUpdate();
            
            System.out.println("Tupla modificada");
            
            ConnectUsuarios.close(conexion2, declaracion);
            //declaracion.close();
            //conexion2.close();
            
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}
