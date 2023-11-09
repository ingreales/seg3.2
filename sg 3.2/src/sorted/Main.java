package sorted;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,4,6,8,10,12);

        List<Integer>SortedNumeros = numeros.stream()

                .filter(n -> n < 10)
                .sorted()
                .toList();
        System.out.println(SortedNumeros);
    }
}
