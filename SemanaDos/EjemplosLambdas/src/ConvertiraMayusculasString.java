import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertiraMayusculasString {

	public static void main(String[] args) {
		
		//Function<T, R>
		//Convierte a mayusculas las letras
		List<String> fruits = Arrays.asList("manzana", "pera", "naranja"); 
		List<String> uppercaseFruits = fruits.stream()
				.map(fruit -> fruit.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(uppercaseFruits);
	}

}
