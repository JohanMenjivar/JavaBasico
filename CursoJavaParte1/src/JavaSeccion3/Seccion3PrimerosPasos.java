package JavaSeccion3;
import java.util.Scanner;

public class Seccion3PrimerosPasos {
		
	public static void main(String args[]) {
        Scanner rdr = new Scanner(System.in);
        
        System.out.println("Calculadora de Áreas");
        System.out.println("1. Área de un triángulo");
        System.out.println("2. Área de un círculo");
        System.out.println("3. Área de un rectángulo");
        System.out.println("4. Área de un cuadrado");
        
        int O = rdr.nextInt();
        switch (O){
        	case 1:
        		System.out.println("\ntriangulo:");
        		System.out.println("inserte la base:");
        		double b1=rdr.nextDouble();
        		System.out.println("inserte la altura:");
        		double a1=rdr.nextDouble();
        		System.out.println("\narea: " + (b1*a1/2) + " unidades");

        		break;
        	case 2:
        		System.out.println("\ncirculo:");
        		System.out.println("inserte el radio:");
        		double r =rdr.nextDouble();
        		System.out.println("\narea: " + (r*r*3.1416) + " unidades");
        		break;
        	case 3:
        		System.out.println("\nrectangulo:");
        		System.out.println("inserte la base:");
        		double b2=rdr.nextDouble();
        		System.out.println("inserte la altura:");
        		double a2=rdr.nextDouble();
        		System.out.println("\narea: " + (b2*a2) + " unidades");
        		break;
        	case 4:
        		System.out.println("\ncuadrado:");
        		System.out.println("inserte el lado:");
        		double l =rdr.nextDouble();
        		System.out.println("\narea: " + (l*l) + " unidades");
        		break;
        	default:
        		
        		
        }
        
	}
	
}
