package JavaSeccion16;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.IOException;

class WorkerSocket extends Thread{
	
	private Socket client;
	
	public WorkerSocket(Socket client) {
		this.client=client;
	}
	
	@Override
	public void run() {
		try(DataInputStream dis=new DataInputStream(client.getInputStream());){
		String mensaje = null;
		do {
			mensaje=dis.readUTF();
			System.out.println(client.getInetAddress().getHostName()+" dice: "+mensaje);
		}while(!"salir".equals(mensaje));
		} catch (IOException e){
			System.err.println(e.getMessage());
		}
	}
	
}

public class ServerSocketBasico {
	
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
