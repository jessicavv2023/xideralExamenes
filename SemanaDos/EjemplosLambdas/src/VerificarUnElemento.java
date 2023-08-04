import java.util.Arrays;
import java.util.List;

public class VerificarUnElemento {

	public static void main(String[] args) {
		//Predicate<t> 
		//Regresa booleano 
		List<String> fruits = Arrays.asList("manzana", "pera", "naranja", "plátano");
		boolean containsOrange = fruits.stream()
		.anyMatch(fruit -> fruit.equals("naranja"));
		System.out.println(containsOrange );
	}

}
