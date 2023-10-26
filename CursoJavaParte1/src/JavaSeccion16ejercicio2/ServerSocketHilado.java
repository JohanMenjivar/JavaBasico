package JavaSeccion16ejercicio2;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class WorkerSocket extends Thread{
	
	private Socket client;
	
	public WorkerSocket(Socket client) {
		this.client=client;
	}
	
	@Override
	public void run() {
		 try (DataInputStream dis = new DataInputStream(client.getInputStream())) {
	            String fileName = dis.readUTF();

	            if (!fileName.isEmpty()) {
	                try (FileOutputStream fos = new FileOutputStream(fileName)) {
	                    byte[] buffer = new byte[4096];
	                    int bytesRead;
	                    while ((bytesRead = dis.read(buffer)) != -1) {
	                        fos.write(buffer, 0, bytesRead);
	                    }
	                }
	                System.out.println("Archivo recibido y guardado en el servidor: " + fileName);
	                String currentDirectory = System.getProperty("user.dir");
	                System.out.println("Directorio de trabajo actual del servidor: " + currentDirectory);
	            }
	        } catch (IOException e) {
	            System.err.println(e.getMessage());
	        }
	}
	
}

public class ServerSocketHilado{
	
	public static void main(String[] args) throws IOException{
		try(ServerSocket socket = new ServerSocket(8090)){
			while(true) {
				System.out.println("Escuchando clientes");
				Socket client = socket.accept();
				System.out.println("cliente conectado: "+client.getInetAddress().getHostName());
				new WorkerSocket(client).start();
			}
	}
	}
}

