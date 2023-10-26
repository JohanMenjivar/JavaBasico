package JavaSeccion6Herencia;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
    
}

class Libro extends Producto {
    public Libro(String nombre, double precio) {
        super(nombre, precio);
    }
}

class Electrodomestico extends Producto {
    String marca;

    public Electrodomestico(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
    
    
}

