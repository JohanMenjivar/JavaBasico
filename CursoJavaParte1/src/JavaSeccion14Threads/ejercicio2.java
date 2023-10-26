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

class DecrementorConPrioridad extends Thread{
	 
	 private int counter=0;
	 
	 public DecrementorConPrioridad(String name, int numero,int priority) {
		 super(name);
		 this.counter=numero;
		 this.setPriority(priority);
	 }
	 @Override
	 public void run() {
		 System.out.println(getName() + " con prioridad "+ getPriority() +" comenzó.");
		 for(int i = counter ; i>=0;i--) {
		
		 System.out.println(getName() + " esta contanto hacia atras: "+i ); 

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		 }
		 System.out.println(getName() + " terminó.");
		 
	 }
}

public class ejercicio2 {
	
	public static void main(String[] args) {
		ejercicio1(30);
		
	}
	
	public static void ejercicio1(int nHilos) {
		String name = "";
		Random rand = new Random(); 
		for (int i=0;i<nHilos;i++) {
			name = "hilo " + (i+1);
			new DecrementorConPrioridad(name, rand.nextInt(10)+1,rand.nextInt(10)+1).start();

		}
	}
}
