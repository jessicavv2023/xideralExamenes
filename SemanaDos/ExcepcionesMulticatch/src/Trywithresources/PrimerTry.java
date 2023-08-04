package Trywithresources;

//leer texto de una fuente de entrada de caracteres,
//como archivos o flujos de datos. 
//Proporciona métodos para leer líneas de texto y almacenarlas 
import java.io.BufferedReader;

//Leer caracteres de un archivo de texto
import java.io.FileReader;

//excepcion que se lanza ocurre un error
//en operaciones de entrada/salida (E/S), 
//como lectura o escritura de archivos
import java.io.IOException;

public class PrimerTry {

	public static void main(String[] args) {
		 try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                System.out.println(linea);
	            }
	        } catch (IOException ex) {
	            System.out.println("Error al leer el archivo: " + ex.getMessage());
	        }

	}

}
