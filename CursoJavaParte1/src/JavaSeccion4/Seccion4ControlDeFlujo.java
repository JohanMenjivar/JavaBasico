package JavaSeccion4;

public class Seccion4ControlDeFlujo {
	
	public static void main(String args[]) {
		System.out.println("TABLAS DE MULTIPLICAR \n" );
		for(int i = 1;i<=20;i++) {
			if(i%2==0) {
			System.out.println("tabla del " + i);
			for(int j = 1; j<=12;j++) {
				System.out.println("> " + i + " x " + j + " = " + i*j);
				if(j==12) System.out.println("\n");
			}
			}
		}
	}
}
