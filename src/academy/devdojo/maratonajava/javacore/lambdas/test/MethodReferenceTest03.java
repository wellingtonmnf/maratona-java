package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        // Referência a método de instância de um objeto arbitrário de um tipo específico:

        // Sintaxe com lambdas usando método compareTo() da String que implementa Comparable
        list.sort((s1, s2) -> s1.compareTo(s2));

        // Sintaxe com method reference usando list.sort()
        list.sort(String::compareTo);
        System.out.println(list);

        // Sintaxe com lambdas usando método parseInt() de Integer
        Function<String, Integer> conversor = s -> Integer.parseInt(s);
        // Sintaxe com method reference
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        // Convertendo String para Integer através da chamada do método apply()
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        // Sintaxe com lambdas usando método contains() de List
        BiPredicate<List<String>, String> checagemDeNome = (lista, string) -> lista.contains(string);
        System.out.println(checagemDeNome.test(list, "Veldora"));

        // Sintaxe com method reference
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Rimuru"));
    }
}
