package agenda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 * Clase principal que pide la introducción de un valor para luego mostrar los datos de la base de datos en caso que el dato
 * introducido sea correcto
 * @author Andy
 */
public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int menu=7;
		int option = 0;
		
		Conexion conexion = new Conexion();
		Connection cn=null;
		Statement stm = null;
		ResultSet rs = null;

		do {
			System.out.println("Por favor introduzca el mail o el teléfono");
			String buscar = teclado.nextLine();
			
			if(buscar.equalsIgnoreCase("acs@gmail.com")||buscar.equalsIgnoreCase("666666666")||buscar.equalsIgnoreCase("lms@gmail.com")||buscar.equalsIgnoreCase("666666665")||buscar.equalsIgnoreCase("666666664")||buscar.equalsIgnoreCase("jdp@gmail.com")||buscar.equalsIgnoreCase("caf@gmail.com")||buscar.equalsIgnoreCase("666666663")||buscar.equalsIgnoreCase("ams@gmail.com")||buscar.equalsIgnoreCase("666666662"))
			{
				try {
					cn=Conexion.conectar();
					stm=cn.createStatement();
					rs=stm.executeQuery("select*from info");
					/**
					 * Mostrará los datos de la base de datos
					 */
					while(rs.next()) {
						String nombre=rs.getString(1);
						String apellidos=rs.getString(2);
						String direccion=rs.getString(3);
						String mail=rs.getString(4);
						String teléfono=rs.getString(5);
						
						System.out.println(nombre+" - "+apellidos+" - "+direccion+" - "+" - "+mail+" - "+teléfono);
						
					}
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||1");
					System.out.println(buscar+" DATO CORRECTO, RESULTADOS MOSTRADOS ENCIMA");
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||1");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					try {
						if (rs!=null) {
							rs.close();
						}
						if(stm!=null) {
							stm.close();
						}
						if(cn!=null) {
							cn.close();
						}
					} catch (Exception e2) 
					{
						e2.printStackTrace();
					}
			}
			
			}
			else {
				System.out.println("-----------------------------------------------------------");
				System.out.println("Lo que busca no coincide con los datos registrados");
			}
			}while(menu==7);
		teclado.close();
				
}
	
}
