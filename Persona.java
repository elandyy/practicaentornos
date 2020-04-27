package agenda;
/**
 * Clase que contiene informaci�n de unas personas
 * 
 * @author Andy
 *
 */
public class Persona {

/**
 * 
 * @param nombre	atributo que describe el nombre de una persona*/
String nombre;

/**
 * @param apellidos
 */
String apellidos;

/**
 * @param direcci�n
 */
String direcci�n;

/**
 * @param mail
 */
String mail;

/**
 * @param tel�fono
 */
String tel�fono;

public Persona(String nombre, String apellidos, String direcci�n, String mail, String tel�fono) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direcci�n = direcci�n;
	this.mail = mail;
	this.tel�fono = tel�fono;
}

/**
 * m�todo toString() que retorna todos los datos de las personas
 */
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", direcci�n=" + direcci�n + ", mail=" + mail
			+ ", tel�fono=" + tel�fono + "]";
}




		
	


}
