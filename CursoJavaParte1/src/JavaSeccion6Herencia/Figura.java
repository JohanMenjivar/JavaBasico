package JavaSeccion6Herencia;

public class Figura {
    public double calcularArea() {
        return 0.0;
    }
}

class Circulo extends Figura {
    private double radio;
    
	public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}