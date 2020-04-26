package agenda;

public class Persona {

String nombre;
String apellidos;
String dirección;
String mail;
String teléfono;

/**
 * 
 * @param nombre
 * @param apellidos
 * @param dirección
 * @param mail
 * @param teléfono
 */
public Persona(String nombre, String apellidos, String dirección, String mail, String teléfono) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dirección = dirección;
	this.mail = mail;
	this.teléfono = teléfono;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dirección=" + dirección + ", mail=" + mail
			+ ", teléfono=" + teléfono + "]";
}




		
	


}
