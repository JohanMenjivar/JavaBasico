package JavaSeccion5Mascotas;

public class Main {
	public static void main(String args[]) {
	Perro perro = new Perro("Clifford",5,"rojo","rottweiler");
	System.out.println(perro.getNombre());
	
	Gato gato = new Gato("Gumball",12,"azul","comun");
	System.out.println(gato.getNombre());
	}
}
