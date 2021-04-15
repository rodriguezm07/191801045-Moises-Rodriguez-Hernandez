
package Conexion;

import java.sql.*;


public class ConnectUsuarios {
    
    
    //Es una palabra reselvada que determina el atributo es de la clases y no del obejto
    //Final es un modificador que indicxa que el atributo es contanste por lo que el valor no se le podra cambiar el valor en ningun modo
    private static final String URL ="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection()throws SQLException {
        
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
        
    }
    public static void close(Connection conexion, Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    public static void close(Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
    
    }public static void close(Connection conexion, Statement declaracion, ResultSet resultado)throws SQLException{
        conexion.close();
        resultado.close();
        declaracion.close();
    
    }
    
            
    
}
