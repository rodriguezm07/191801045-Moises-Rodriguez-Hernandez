
//import Conexion.Connect;
import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    public static void main(String[] args) throws SQLException{
        
        List<Usuario> ListaUsuarios = new ArrayList<>();
        ListaUsuarios = DaoUsuarios.usuariosLista();
        for(Usuario usuario:ListaUsuarios){
            System.out.println(usuario);
        
        }
        
        /*
        try{
            //Crear conexion con BD
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Connect.getConnection();
            //Crear una declaracion de como se trabaja con base de datos
            Statement declaracion = conexion.createStatement();
            String sql = "SELECT * FROM usuario";
            //Variable que recibira el resultado de ejectutar la sentencia SQL 
            ResultSet resultado = declaracion.executeQuery(sql);
            //Imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getString("nombre_usuario"));
            }
            //Cerrar la conexion con la base de datos
            Connect.close(conexion, declaracion, resultado);
            //resultado.close();
            //declaracion.close();
            //conexion.close();
            
            
        }
        catch(SQLException ex){
                
            ex.printStackTrace(System.out);
                
                }
        */
    }
    
    
}
