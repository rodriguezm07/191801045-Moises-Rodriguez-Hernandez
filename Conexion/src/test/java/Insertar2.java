import Conexion.ConnectUsuarios;
import java.sql.*;
import java.util.Scanner;

public class Insertar2 {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Crear conexion 
            //Connection conexion2 = DriverManager.getConnection(url,"root","");
            Connection conexion2 = ConnectUsuarios.getConnection();
            
            //Crear Query
            String sql = "INSERT INTO usuarioidentificacion(usuario_domicilio,rfc,edad,curp) VALUES(?,?,?,?)";
            
            //Preparar el Query
            PreparedStatement declaracion = conexion2.prepareStatement(sql);
            
            //Insertar datos
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese domicilio: ");
            String domicilio = scan.nextLine();
            System.out.println("Ingrese su RFC: ");
            String rfc = scan.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("Ingrese su CURP: ");
            String curp = scan.nextLine();
            
            //Llamamos a los atributos a insertar datos
            declaracion.setString(1, domicilio);
            declaracion.setString(2, rfc);
            declaracion.setInt(3, edad);
            declaracion.setString(4, curp);
            
            
            //Ejecutamos el Query
            declaracion.executeUpdate();
            
            System.out.println("Tupla insertada");
            
            //Cerramos las conexiones
            ConnectUsuarios.close(conexion2, declaracion);
            //declaracion.close();
            //conexion2.close();
        
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
}
