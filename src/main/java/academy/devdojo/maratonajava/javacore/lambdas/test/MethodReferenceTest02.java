package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1000), new Anime("Naruto", 720)));
        AnimeComparators animeComparators = new AnimeComparators();
        // Referência a método de instância de um objeto específico:

        /* O Java consegue inferir o tipo da lambda observando o contexto em que ela é usada.
         * Neste caso, o Collections.sort() espera um Comparator<Anime>.
         * O Comparator é uma interface funcional, ou seja, possui apenas um método abstrato (compare()).
         * A lambda que você criou implementa esse único método de forma implícita.
         * O Java, ao encontrar uma lambda que se encaixa na assinatura de um método abstrato de uma interface funcional, realiza uma conversão implícita.
         * Ou seja, a lambda é automaticamente "convertida" para um objeto que implementa a interface Comparator<Anime>.
         */

        // Sintaxe com lambdas usando método comparador que NÃO implementa um Comparator
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        // Sintaxe com method reference usando list.sort()
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);


    }
}
