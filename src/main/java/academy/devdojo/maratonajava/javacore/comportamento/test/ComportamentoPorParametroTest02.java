package academy.devdojo.maratonajava.javacore.comportamento.test;

import academy.devdojo.maratonajava.javacore.comportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        // Aqui o método passa a lista e cria uma classe anônima
        // que instancia a interface 'CarPredicate'
        List<Car> greenCars = filter(cars, new CarPredicate() {
            // Aqui a classe anônima sobrescreve o método e implementa a lógica
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });

        // Sintaxe Lambda passando os argumentos e a lógica
        // usada na operação em AMBOS os métodos
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> yearBeforeCars1 = filter(cars, car -> car.getYear() < 2015);
        List<Car> yearBeforeCars2 = filterCar(cars, car -> car.getYear() < 2020);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars1);
        System.out.println(yearBeforeCars2);

    }
    // Método com interface funcional CarPredicate definida pelo desenvolvedor
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) { // Chamada ao método implementado na classe anônima
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    // Método com interface funcional Predicate<T> presente no Java
    private static List<Car> filterCar(List<Car> cars, Predicate<Car> carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) { // Chamada ao método implementado na classe anônima
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
