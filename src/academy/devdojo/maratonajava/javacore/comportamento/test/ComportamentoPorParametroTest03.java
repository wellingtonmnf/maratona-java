package academy.devdojo.maratonajava.javacore.comportamento.test;

import academy.devdojo.maratonajava.javacore.comportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        // Sintaxe Lambda passando os argumentos e a lógica usada na operação
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
        // Lista do tipo 'Integer' criada, diferente do tipo 'Car'
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        // Sintaxe Lambda passando os argumentos e a lógica usada na operação
        List<Integer> numerosPares = filter(numeros, num -> num%2 == 0);
        System.out.println(numerosPares);

    }
    // Método genérico parametrizado que recebe qualquer tipo de objeto
    // e qualquer condição de comportamento com a lógica necessária
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){

        List<T> filteredList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }

        return filteredList;
    }

}
