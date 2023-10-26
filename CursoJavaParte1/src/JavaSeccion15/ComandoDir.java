package JavaSeccion15;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class ComandoDir {
	public static void print(File []files) {

		if(files!=null) {
			for(File file : files) {
	            Date fechaModificacion = new Date(file.lastModified());
	            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					System.out.println(formatoFecha.format(fechaModificacion)+"\t "+file.getName());
			}
		}
	}

	public static void main(String[] args) {
		
		File f=new File("F:\\");
		print(f.listFiles());
	}

	
	}

