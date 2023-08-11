import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Name {

    public static void main(String[] args) {

        Stream<String> listaNombres =
                Stream.of("Zlatan", "Tim", "Bo", "Georfe", "Adam", "Oscar");

        List<String> nombresFiltradosOrdenadosUnicos = listaNombres
                .filter(s -> s.length() > 2)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(nombresFiltradosOrdenadosUnicos);
    }

}
