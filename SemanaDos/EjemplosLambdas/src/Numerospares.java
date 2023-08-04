import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numerospares {

	public static void main(String[] args) {
		//filter se usa para filtrar los numeros
		//pares de una listas
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream()
				//si el residuo es cero es par 
				//metodo filter
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList()); 
		
		       System.out.println(evenNumbers);

				//Predicate<T> y regresa un booleano 

		       
	}

}
