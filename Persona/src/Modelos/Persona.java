package Modelos;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String Nombre, String Apellidos, int Edad) {
		this.nombre = Nombre;
		this.apellidos = Apellidos;
		this.edad = Edad;
		if (edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.apellidos = Apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setApellidos(int Edad) {
		this.edad = Edad;
	}

	public String mostrarEdad() {

		String frase;

		if (getEdad() < 18) {
			frase = "Menor de edad";
		} else if (getEdad() >= 18 && getEdad() <= 65) {
			frase = "Mayor de edad";
		} else {
			frase = "Jubilado";
		}
		return frase;
	}

}
