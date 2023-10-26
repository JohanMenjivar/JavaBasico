package JavaEjercicioFinal;
import java.io.*;
import java.net.*;
import java.util.List;

public class ClientePersonas {
	
	public static void main(String[] args) {
		try (Socket clientSocket = new Socket("localhost", 8090)) {
			 Persona persona = new Persona(7, "nezahualcoyotl", "123456789");
			 interactuarPersona( persona, clientSocket,"mostrar");
			 
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
	public static void interactuarPersona(Persona persona, Socket socketDelServer,String accion) throws IOException{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socketDelServer.getOutputStream());
            DataOutputStream dos = new DataOutputStream(socketDelServer.getOutputStream());
            DataInputStream dis = new DataInputStream(socketDelServer.getInputStream());
            dos.writeUTF(accion);
            objectOutputStream.writeObject(persona);
            System.out.println(dis.readUTF());
            objectOutputStream.flush();
            objectOutputStream.close();
            dos.close();
            dis.close();
            

	}
	

}