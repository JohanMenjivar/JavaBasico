package JavaSeccion5Mascotas;

public class Mascotas {
	private String nombre;
	private int edad;
	private String color;
	
	public Mascotas(String nombre, int edad, String color) {
		this.nombre=nombre;
		this.edad=edad;
		this.color=color;		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String comer() {
		return "estoy comiendo";
	}
	public String dormir() {
		return "Zzzzzzzzz";
	}
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
    }
}
