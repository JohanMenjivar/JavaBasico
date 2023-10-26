package JavaSeccion5Mascotas;

public class Perro extends Mascotas{
	private String razaPerro;
	
	public Perro(String nombre, int edad, String color, String razaPerro) {
		super( nombre,  edad,  color);
		this.razaPerro=razaPerro;
	}
	
	
	public String getRazaPerro() {
		return razaPerro;
	}


	public void setRazaPerro(String razaPerro) {
		this.razaPerro = razaPerro;
	}


	public String ladrar() {
		return "Wau";
		
	}
	public String perseguirGato() {
		return "persiguiendo gato";
		
	}
		
}
