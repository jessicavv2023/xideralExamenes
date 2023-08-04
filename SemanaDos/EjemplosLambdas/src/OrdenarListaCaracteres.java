import java.util.Arrays;
import java.util.List;

public class OrdenarListaCaracteres {

	public static void main(String[] args) {
		//Para ordenar los nombres 
		//Es Comparator <T>
		//Es para compara dos objetos y determinar su orden
		List<String> names = Arrays.asList("Ana", "Carlos", "Eva", "Pedro", 
				"Juan");
				names.sort((a, b) -> a.length() - b.length());
				System.out.println(names);
				
	
	}

}
