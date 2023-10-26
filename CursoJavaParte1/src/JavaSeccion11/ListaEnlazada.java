package JavaSeccion11;

public class ListaEnlazada {
	public class Nodo{
		int contenido;
		Nodo siguiente=null;
	    public Nodo(int valor) {
	        this.contenido = valor;
	        this.siguiente = null;
	    }
	}
	Nodo cabeza;
	
	public void insertarValor(int x) {
		Nodo nuevoNodo = new Nodo(x);
		if(this.cabeza==null) {
		this.cabeza=nuevoNodo;
		}else {
			Nodo nodo = this.cabeza;
			while(nodo.siguiente !=null) {
				nodo=nodo.siguiente;
			}
			nodo.siguiente=nuevoNodo;
		}

	}
	
	public int buscar(int n) {
		Nodo navegador;
		navegador=cabeza;
		int i=0;
		while(i<n) {
			navegador=navegador.siguiente;
			if(navegador==null || i<0) {
				System.out.println("indice no valido");
				return 404;

			}
			i++;
		}
		return navegador.contenido;
	}
	
	public void borrar(int n) {
		Nodo anterior= null;
		Nodo navegador;
		navegador=cabeza;
		int i=0;
		if (n == 0) {
	        if (cabeza != null) {
	            cabeza = cabeza.siguiente;
	        }
	        return;
	    }
		while(i<n) {
			anterior = navegador;
			navegador=navegador.siguiente;
			if(navegador==null || i<0) {
				System.out.println("indice no valido");
				return;
			}
			i++;
		}
		anterior.siguiente = navegador.siguiente;
	}
	
	
	
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.contenido + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}


