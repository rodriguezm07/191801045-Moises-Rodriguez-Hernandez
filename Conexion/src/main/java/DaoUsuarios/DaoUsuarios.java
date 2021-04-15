
package DaoUsuarios;

import Conexion.ConnectUsuarios;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DaoUsuarios {
    
    private static String sql;
    
    public static List<Usuario> usuariosLista() throws SQLException{
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        Connection conexion = ConnectUsuarios.getConnection();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()){
            Usuario usuario = new Usuario(resultado.getString("nombre_usuario"),resultado.getString("contraseña"),resultado.getString("fecha_de_alta"),resultado.getInt("id"),resultado.getInt("status"));
            listaUsuarios.add(usuario);
        }
        ConnectUsuarios.close(conexion, declaracion, resultado);

        return listaUsuarios;
    }
     
    public static void insertar(Usuario usuario)throws SQLException{
        Connection conexion = ConnectUsuarios.getConnection();
        
        sql = "INSERT INTO usuario(nombre_usuario,contraseña,status) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        
        declaracion.setString(1,usuario.getNombreUsuario());
        declaracion.setString(2,usuario.getContraseña());
        declaracion.setInt(3,usuario.getStatus());   
        
        declaracion.executeUpdate();
        
        ConnectUsuarios.close(conexion,declaracion);
    
    }
    
    public static void eliminar(Usuario usuario) throws SQLException{
    
        Connection conexion = ConnectUsuarios.getConnection();
        sql = "DELETE FROM usuario WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1,usuario.getId());
        declaracion.executeUpdate();
        ConnectUsuarios.close(conexion,declaracion);
    
    }
    public static void modificar(Usuario usuario) throws SQLException{
        
        Connection conexion = ConnectUsuarios.getConnection();
        sql = "UPDATE usuario SET nombre_usuario =? ,contraseña =?,status =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(sql);    
        declaracion.setString(1,usuario.getNombreUsuario());
        declaracion.setString(2,usuario.getContraseña());
        declaracion.setInt(3, usuario.getStatus());
        declaracion.setInt(4, usuario.getId());
        declaracion.executeUpdate();
        ConnectUsuarios.close(conexion,declaracion);
    }
    
     
    
}
