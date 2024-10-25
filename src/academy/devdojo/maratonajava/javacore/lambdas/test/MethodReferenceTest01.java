package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1000), new Anime("Naruto", 720)));
        // Referência a um método estático:

        // Sintaxe com lambdas usando Comparator
        Collections.sort(animeList, (anime1, anime2) -> anime1.getTitle().compareTo(anime2.getTitle()));
        // Sintaxe com lambdas usando método comparador que NÃO implementa um Comparator
        Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        // Sintaxe com method reference usando Collections.sort()
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        // Sintaxe com method reference usando list.sort()
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
