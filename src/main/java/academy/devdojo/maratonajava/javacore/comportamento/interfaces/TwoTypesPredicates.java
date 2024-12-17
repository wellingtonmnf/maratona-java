package academy.devdojo.maratonajava.javacore.comportamento.interfaces;

@FunctionalInterface
public interface TwoTypesPredicates<T, U> {
    boolean test(T t, U u);
}
