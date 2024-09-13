import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaDosPares_Impares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando números pares e coletando em uma nova lista
        List<Integer> pares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Exibindo a lista de números pares
        System.out.println("Números pares: " + pares);

        // Somando os números pares
        int somaPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos números pares: " + somaPares);

        // Somando os números ímpares
        int somaImpares = numeros.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}
