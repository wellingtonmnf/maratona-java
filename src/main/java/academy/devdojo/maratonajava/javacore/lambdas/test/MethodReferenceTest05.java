package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest05 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "lambda", "stream", "php", "mysql");

        // Usando method reference para comparar o comprimento das strings
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
    }
}
