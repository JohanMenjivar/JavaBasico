package JavaSeccion11;
import java.util.ArrayList;
import java.util.List;
import JavaSeccion5Mascotas.Mascotas;

public class JavaSeccion11WrappersYColecciones {
    public static void main(String[] args) {
       /* List<Mascotas> mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Mascota1", 3, "Amarillo"));
        mascotas.add(new Mascotas("Mascota2", 5, "Blanco"));
          
        mascotas.add( new Mascotas("Mascota3", 2, "Negro"));
        for(int i=0; i<mascotas.size(); i++)
        	System.out.println(mascotas.get(i).toString());*/
    
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarValor(1);
        lista.insertarValor(2);
        lista.insertarValor(3);
        lista.imprimirLista();
        
        System.out.println(lista.buscar(0));
        
        System.out.println(lista.buscar(3));
        lista.borrar(1);
        lista.imprimirLista();
        
    }
}
