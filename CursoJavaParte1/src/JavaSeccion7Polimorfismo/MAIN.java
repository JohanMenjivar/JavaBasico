package JavaSeccion7Polimorfismo;

public class MAIN {
	public static void main(String args[]) {
		CocheDeLujo cocheLujo = new CocheDeLujo("Lamborghini",2024);
		Coche coche = new Coche("toyota",2005);
		
		coche.Mantenimiento();
		cocheLujo.Mantenimiento();
	}
}
