package JavaSeccion10Arreglos;
import JavaSeccion5Mascotas.Mascotas;
import java.util.Random;
public class JavaSeccion10Arreglos {

	public static void main(String args[]) {

		
	    /*Mascotas[] mascotas = new Mascotas[3];
	    mascotas[0] = new Mascotas("Mascota1", 3, "Amarillo");
	    mascotas[1] = new Mascotas("Mascota2", 5, "Blanco");
	    mascotas[2] = new Mascotas("Mascota3", 2, "Negro");
	    imprimirMascota(mascotas);*/
		
		int arreglo1[][]=new int[3][3];
		int arreglo2[][]=new int[3][3];
		Random random = new Random();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arreglo1[i][j]=random.nextInt(100);
				arreglo2[i][j]=random.nextInt(100);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arreglo1[i][j] + " + "+ arreglo2[i][j] + " = " + (arreglo1[i][j]+arreglo2[i][j]));
			}
		}
		
		}
		
		
		
	
	public static void arreglosDeCadaTipo() {
		int[] intArray = {1,2,3,4};
		for(int i=0;i<intArray.length;i++)
		System.out.println(intArray[i]);
		System.out.println("\n");
		
		byte[] intByte = {1,2,3,4};
		for(int i=0;i<intByte.length;i++)
		System.out.println(intByte[i]);
		System.out.println("\n");
		
		char[] intChar = {'a','b','c','d'};
		for(int i=0;i<intByte.length;i++)
		System.out.println(intChar[i]);
		System.out.println("\n");
		
		
	    boolean[] booleanArray = {true, false, true, false};
	    for (int i = 0; i < booleanArray.length; i++) 
	    System.out.println(booleanArray[i]);
	    System.out.println("\n");

	    short[] shortArray = {10, 20, 30, 40};
	    for (int i = 0; i < shortArray.length; i++)
	    System.out.println(shortArray[i]);
	    System.out.println("\n");

	    double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
	    for (int i = 0; i < doubleArray.length; i++) 
	    System.out.println(doubleArray[i]);
	    System.out.println("\n");

	    float[] floatArray = {1.0f, 2.0f, 3.0f, 4.0f};
	    for (int i = 0; i < floatArray.length; i++)
	    	System.out.println(floatArray[i]);
	    System.out.println("\n");

	    long[] longArray = {100L, 200L, 300L, 400L};
	    for (int i = 0; i < longArray.length; i++) 
	    System.out.println(longArray[i]);
	}
	
	public static void triangulo() {
		int altura=5;
		
		char[][] triangulo=new char[altura][];
		
		for(int i=0; i<altura ; i++) {
			triangulo[i] = new char[i+1];
			for(int j=0; j<i+1 ; j++) {
				triangulo[i][j]='*';
			}
		}
		for(int i=0; i<altura ; i++) {
			for(int j=0; j<i+1 ; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.print('\n');
			
		}
	}
	
	public static void imprimirMascota(Mascotas[] mascota) {
		for(int i = 0; i<mascota.length;i++) {
			System.out.println(mascota[i].toString());
		}
	}
}
