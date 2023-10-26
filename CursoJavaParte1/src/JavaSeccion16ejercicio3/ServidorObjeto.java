package JavaSeccion16ejercicio3;
import java.io.*;
import java.net.*;
public class ServidorObjeto {
	public static void main(String[] args) {
        try ( ServerSocket serverSocket = new ServerSocket(8090);){
           
            System.out.println("Servidor en espera de conexiones...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado desde " + clientSocket.getInetAddress().getHostAddress());

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

                ObjetoHttp httpRecibido = (ObjetoHttp) in.readObject();
                System.out.println("Objeto recibido del cliente: " + httpRecibido.toString());

                ObjetoHttpRespuesta response = new ObjetoHttpRespuesta(httpRecibido.getBody(), httpRecibido.getHeaders(),202);
                out.writeObject(response);
                out.flush();

                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
