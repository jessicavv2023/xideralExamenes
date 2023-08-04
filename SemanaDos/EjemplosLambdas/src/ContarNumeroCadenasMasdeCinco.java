import java.util.Arrays;
import java.util.List;

public class ContarNumeroCadenasMasdeCinco {

	public static void main(String[] args) {
		//
		
		List<String> words = Arrays.asList("casa", "coche", "perro", "árbol", "sol");
		long count = words.stream().filter(word -> word.length() <= 4).count();
		System.out.println(count);
		
	}

}
