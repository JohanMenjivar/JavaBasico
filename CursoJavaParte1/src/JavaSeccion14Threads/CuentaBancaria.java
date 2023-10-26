package JavaSeccion14Threads;

public class CuentaBancaria {
	
	private String name;
	private double capital=0;
	public CuentaBancaria(String name, double capital) {
		this.name = name;
		this.capital = capital;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	public boolean validarMonto(double monto) {
		if(monto>0 && monto<=this.capital )
			return true;

			return false;
		
	}
	public synchronized double retirar(double montoRetirar) {
		if(validarMonto(montoRetirar)) {
			this.capital=this.capital-montoRetirar;
			return montoRetirar;
		}
		return 0;
	}

}


