import java.util.Arrays;
import java.util.List;

public class MinimodeunaLista {

	public static void main(String[] args) {
		
		//Comparator<T>
		List<Integer> numbers = Arrays.asList(15, 7, 21, 13, 9);
				int min = numbers.stream().min((a, b) ->
				a.compareTo(b)).orElse(0);
				System.out.println(min);
	}

}
