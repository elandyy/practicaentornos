package agenda;

public class Persona {

String nombre;
String apellidos;
String direcci�n;
String mail;
String tel�fono;

/**
 * 
 * @param nombre
 * @param apellidos
 * @param direcci�n
 * @param mail
 * @param tel�fono
 */
public Persona(String nombre, String apellidos, String direcci�n, String mail, String tel�fono) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.direcci�n = direcci�n;
	this.mail = mail;
	this.tel�fono = tel�fono;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", direcci�n=" + direcci�n + ", mail=" + mail
			+ ", tel�fono=" + tel�fono + "]";
}




		
	


}
