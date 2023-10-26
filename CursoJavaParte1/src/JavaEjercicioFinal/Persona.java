package JavaEjercicioFinal;

import java.io.Serializable;

public class Persona implements Serializable{
    private int id;
    private String nombre;
    private String numeroTelefono;

    public Persona(int id, String nombre, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", numeroTelefono=" + numeroTelefono + "]";
    }
}