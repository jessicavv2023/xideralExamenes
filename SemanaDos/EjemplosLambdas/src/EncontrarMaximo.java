import java.util.Arrays;
import java.util.List;

public class EncontrarMaximo {

	public static void main(String[] args) {
		
		//Comparator<T>
		//Regresa un valor 
		List<Integer> numbers = Arrays.asList(15, 7, 21, 13, 9);
		int max = numbers.stream().max((a, b) -> 
		        a.compareTo(b))
				.orElse(0);
		System.out.println(max);
	}

}
