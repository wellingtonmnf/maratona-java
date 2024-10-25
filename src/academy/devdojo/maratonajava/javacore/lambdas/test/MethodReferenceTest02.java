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

        // Sintaxe com lambdas usando método comparador que NÃO implementa um Comparator
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        // Sintaxe com method reference usando list.sort()
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);


    }
}
