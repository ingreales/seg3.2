package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombre = Arrays.asList("valcote","pandoce","voal","bromol");

        List<String>filterednombre = nombre.stream()
                .filter(nombres -> nombres.startsWith("v"))
                .collect(Collectors.toList());

        System.out.println(filterednombre);
    }
}
