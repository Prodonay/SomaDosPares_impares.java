import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordenando a lista de números
        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        // Exibindo a lista de números em ordem
        System.out.println("Números em ordem crescente: " + ordenados);
    }
}
