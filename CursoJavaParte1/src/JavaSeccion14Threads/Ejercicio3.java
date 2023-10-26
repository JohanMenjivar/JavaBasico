package JavaSeccion14Threads;

public class Ejercicio3 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("pepe", 6000);
        for (int i = 0; i < 5; i++) {
            new RetiroDeCliente("hilo " + (i + 1), cuenta).start();
        }
    }
	
}

class RetiroDeCliente extends Thread{
	CuentaBancaria cuenta=null;
	public RetiroDeCliente(String name,CuentaBancaria cuenta) {
		super(name);
		this.cuenta = cuenta;
	}

	@Override
	public void run(){
		synchronized (cuenta) {
            double monto = cuenta.retirar(200);
            if (monto > 0) {
                System.out.println("Retiro exitoso de $" + monto);
                System.out.println("Quedan: $" + cuenta.getCapital() + " en la cuenta");
            }
        }
	}
	
}
	