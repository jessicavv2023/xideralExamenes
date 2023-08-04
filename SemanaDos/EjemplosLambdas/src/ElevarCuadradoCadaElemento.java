import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElevarCuadradoCadaElemento {

	public static void main(String[] args) {
	    //Funtion <T,R>
		//T=Integer 
		//R=es el resultado s
		//para calcular los cuadrados de los numeros
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
		List<Integer> squaredNumbers = numbers.stream()
				//aqui se realiza la opreacion
				.map(n -> n * n) .collect(Collectors.toList());
				System.out.println(squaredNumbers);
		
	}

}
