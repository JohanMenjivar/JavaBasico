package JavaSeccion16ejercicio2;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
public class ClienteHilado{
	public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket socket = new Socket("localhost", 8090)) {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


            String nombreArchivo = "F:\\tilin.txt";
            File archivo = new File(nombreArchivo);

            if (archivo.exists()) {

                dos.writeUTF(archivo.getName());


                try (FileInputStream fis = new FileInputStream(archivo)) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fis.read(buffer)) != -1) {
                        dos.write(buffer, 0, bytesRead);
                    }
                }

                System.out.println("Archivo enviado al servidor.");
            } else {
                System.out.println("El archivo no existe.");
            }
        }
    }
}
