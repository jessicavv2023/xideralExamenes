import java.util.Arrays;
import java.util.List;

public class NumerosImpares {

	public static void main(String[] args) {
		
		//Predicate<T>
		//
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
				boolean allOdd = numbers.stream()
				.noneMatch(n -> n % 2 == 0);
				System.out.println(allOdd);
	}

}
