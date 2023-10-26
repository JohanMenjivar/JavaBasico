 package JavaSeccion14Threads;

import java.util.Random;

/*/class ContadorSynqueado{
	 static int counter=0;
	 
	 public synchronized static void decrement() {
		 counter--;
		 System.out.println(counter); 
	 }
	 public void asignarCounter(int numero) {
		 ContadorSynqueado.counter=numero;
	 }
	 
 }*/
 
 class Decrementor extends Thread{
	 
	 private int counter=0;
	 
	 public Decrementor(String name, int numero) {
		 super(name);
		 this.counter=numero;
	 }
	 @Override
	 public void run() {
		 System.out.println(getName() + " comenzó.");
		 for(int i = counter ; i>=0;i--) {
		
		 System.out.println(getName() + " esta contanto hacia atras: "+i ); 

         try {
             Thread.sleep((long) (Math.random() * 1000)); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
		 }
		 System.out.println(getName() + " terminó.");
		 
	 }
 }
 
public class Main {
	
	public static void main(String[] args) {
		ejercicio1(10);
		
	}
	
	public static void ejercicio1(int numeroDeHilosACrear) {
		String name = "";
		Random rand = new Random(); 
		for (int i=0;i<numeroDeHilosACrear;i++) {
			name = "hilo " + (i+1);
			new Decrementor(name, rand.nextInt(10)+1).start();

		}
	}
}
