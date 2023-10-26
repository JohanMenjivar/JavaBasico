package JavaSeccion16;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ClientSocketBasico {
	public static String readMessage() throws IOException{
		System.out.print("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	
	public static void main(String[] args) throws  UnknownHostException, IOException{
		try(Socket socket = new Socket("localhost",8090);DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
			String mensaje=null;
			do {
				mensaje=readMessage();
				dos.writeUTF(mensaje);
			}while(!"salir".equals(mensaje));
		}
	}
}
