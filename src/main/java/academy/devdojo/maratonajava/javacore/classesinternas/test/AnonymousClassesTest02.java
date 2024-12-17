package academy.devdojo.maratonajava.javacore.classesinternas.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Com a criação de uma classe anônima, NÃO é necessário implementar um Comparator aqui
class BarcoNameComparator implements Comparator<Barco>{

    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa"))); // Lista mutável
        // Implementação de um Comparator direto numa Classe Anônima
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);

        // Implementação de um Comparator direto numa Classe Anônima com programação funcional
        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        System.out.println(barcoList);

    }
}
