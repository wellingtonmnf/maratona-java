package academy.devdojo.maratonajava.javacore.lambdas.service;

import academy.devdojo.maratonajava.javacore.lambdas.dominio.Anime;

public class AnimeComparators {
    // Não implementa a interface funcional Comparator
    public static int compareByTitle (Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    // Não implementa a interface funcional Comparator
    public static int compareByEpisodes (Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
    // Não implementa a interface funcional Comparator

    public int compareByEpisodesNonStatic (Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}