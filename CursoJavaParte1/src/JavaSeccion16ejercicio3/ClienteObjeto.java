package JavaSeccion16ejercicio3;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
public class ClienteObjeto {
	
	public static void main(String[] args) throws  UnknownHostException, IOException{
        try {
            Socket socket = new Socket("localhost", 8090);


            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());


            Map<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "text/plain");
            headers.put("Authorization", "Bearer ABC123");

            ObjetoHttp objetoHttp = new ObjetoHttp("Contenido del cuerpo del mensaje", headers);
            out.writeObject(objetoHttp);
            out.flush();


            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());


            Object response = in.readObject();
            System.out.println("Respuesta del servidor: " + response.toString());


            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		}
	}

