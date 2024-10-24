package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        forEach(strings, (String s) -> System.out.println(s)); // Sintaxe lambda completa
        System.out.println("--------");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(integers, i -> System.out.println(i)); // Sintaxe lambda simplificada

    }
    // A interface Consumer recebe um tipo, processa o parâmetro
    // e não retorna nada
    private static <T> void forEach(List<T> list, Consumer<T> consumer){

        for (T e : list) {
            consumer.accept(e);
        }
    }
}
