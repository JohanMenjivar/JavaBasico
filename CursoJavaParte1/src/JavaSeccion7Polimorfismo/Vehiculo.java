package JavaSeccion7Polimorfismo;

public class Vehiculo {
    String marca;
    int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
    
    
}

class Coche extends Vehiculo {
    public Coche(String marca, int año) {
        super(marca, año);
    }
    public  void Mantenimiento() {
    	System.out.println("Mantenimiento de coche normal");
    }
}

class CocheDeLujo extends Vehiculo {
    public CocheDeLujo(String marca, int año) {
        super(marca, año);
    }
    public  void Mantenimiento() {
    	System.out.println("Mantenimiento de coche de lujo");
    }
}
