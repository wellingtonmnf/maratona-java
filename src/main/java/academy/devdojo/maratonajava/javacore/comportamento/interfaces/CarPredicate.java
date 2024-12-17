package academy.devdojo.maratonajava.javacore.comportamento.interfaces;

import academy.devdojo.maratonajava.javacore.comportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;

public interface CarPredicate {
    // Lambda: anônima, função, conciso
    boolean test (Car car);
    // (parâmetro) ->  <expressão>
    // (Car car) -> car.getColor().equals("Green")
}
