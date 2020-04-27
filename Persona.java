package agenda;
/**
 * Clase que contiene información de unas personas
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
 * @param dirección
 */
String dirección;

/**
 * @param mail
 */
String mail;

/**
 * @param teléfono
 */
String teléfono;

public Persona(String nombre, String apellidos, String dirección, String mail, String teléfono) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dirección = dirección;
	this.mail = mail;
	this.teléfono = teléfono;
}

/**
 * método toString() que retorna todos los datos de las personas
 */
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dirección=" + dirección + ", mail=" + mail
			+ ", teléfono=" + teléfono + "]";
}




		
	


}
