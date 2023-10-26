package JavaSeccion15;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ComandoCp {
	public static void main(String[] args) {
		cp("F:\\tilin.txt","F:\\carpetaprubacomandojava\\tilin.txt");
    }
	
	public static void mv(String archivoACopiar, String destino) {

        Path origenPath = FileSystems.getDefault().getPath(archivoACopiar);
        Path destinoPath = FileSystems.getDefault().getPath(destino);

        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
	}
	public static void cp(String archivoACopiar, String destino) {

        Path origenPath = FileSystems.getDefault().getPath(archivoACopiar);
        Path destinoPath = FileSystems.getDefault().getPath(destino);

        try {
            Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
	}
}
