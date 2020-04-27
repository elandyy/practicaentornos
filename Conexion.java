package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion{
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/conexionBD";
    private static final String USUARIO = "root";
    private static final String CLAVE = "hola";
    
    
    
    static {
    	try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR AL CARGAR EL CONTROLADOR");
			e.printStackTrace();
		}
    }
    
    public static Connection conectar() 
	{
		Connection conexion = null;
    	try 
		{
			conexion=DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conectado con �xito");
		}
		catch (SQLException e)
		{
			System.out.println("ERROR EN LA CONEXI�N");
			e.printStackTrace();
		}
		return conexion;
	}
}



