package JavaSeccion5Mascotas;

public class Gato extends Mascotas{
	private String razaGato;
	
	public Gato(String nombre, int edad, String color, String razaGato) {
		super( nombre,  edad,  color);
		this.razaGato=razaGato;
	}
	
	public String getRazaGato() {
		return razaGato;
	}

	public void setRazaGato(String razaGato) {
		this.razaGato = razaGato;
	}

	public String maullar() {
		return "MIAU";
		
	}
	public String ronronear() {
		return "prrrrr";
		
	}
		
}
