package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, string -> string.length());
        List<String> stringsUpperCase = map(strings, string -> string.toUpperCase());
        System.out.println(integers);
        System.out.println(stringsUpperCase);

    }

    private static <T,R> List<R> map(List<T> list, Function<T,R> function){

        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
