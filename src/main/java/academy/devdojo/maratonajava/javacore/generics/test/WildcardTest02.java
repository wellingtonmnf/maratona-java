package academy.devdojo.maratonajava.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);

    }
    /* O Java não permite que listas de tipos específicos sejam passadas
     * para métodos que esperam listas de tipos mais gerais sem o uso de wildcards.
     * Isso significa que mesmo que Integer seja um subtipo de Number,
     * List<Integer> não é um subtipo de List<Number>.
     * Isso é uma decisão de design para evitar problemas de segurança de tipo.
     */

    // Necessário usar extends na sintaxe de wildcards
    // Não é possível adcionar objetos, pois não é sabido o tipo exato.
    public static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    // Permite adicionar elementos do tipo `Animal` ou subtipos.
    // Pode-se ler dados, mas o tipo de retorno é a superclasse especificada,
    // a não ser que se faça casting do tipo
    public static void printConsultaAnimal(List<? super Animal> animals) {

        animals.add(new Cachorro());
        animals.add(new Gato());

        for (Object animal : animals) {
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                cachorro.consulta();
            }

            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                gato.consulta();
            }
        }

    }
}
