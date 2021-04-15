
import Conexion.ConnectUsuarios;
import java.sql.*;



public class Conexion2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        try{
            //Crear conexion con BD
            //Connection conexion2 = DriverManager.getConnection(url,"root","");
            Connection conexion2 = ConnectUsuarios.getConnection();
            //Crear una declaracion de como se trabaja con base de datos
            Statement declaracion2 = conexion2.createStatement();
            String sql = "SELECT * FROM usuarioidentificacion";
            //Variable que recibira el resultado de ejectutar la sentencia SQL 
            ResultSet resultado2 = declaracion2.executeQuery(sql);
            //Imprimir valores
            while(resultado2.next()){
                System.out.println(resultado2.getString("id"));
                System.out.println(resultado2.getString("usuario_domicilio"));
                System.out.println(resultado2.getString("rfc"));
                System.out.println(resultado2.getString("edad"));
                System.out.println(resultado2.getString("curp"));
            }
            //Cerrar la conexion con la base de datos
            ConnectUsuarios.close(conexion2, declaracion2, resultado2);
            //resultado2.close();
            //declaracion2.close();
            //conexion2.close();
            
            
        }
        catch(SQLException ex){
                
            ex.printStackTrace(System.out);
                
                }
    }
    
}
