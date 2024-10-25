package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1000), new Anime("Naruto", 720)));
        // Referência a um construtor:

        // Sintaxe com lambdas usando new() e Supplier
        Supplier<AnimeComparators> animeComparators = () -> new AnimeComparators();
        // Sintaxe com method reference
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;

        /* O Java consegue inferir o tipo da lambda observando o contexto em que ela é usada.
         * Neste caso, o Collections.sort() espera um Comparator<Anime>.
         * O Comparator é uma interface funcional, ou seja, possui apenas um método abstrato (compare()).
         * A lambda que você criou implementa esse único método de forma implícita.
         * O Java, ao encontrar uma lambda que se encaixa na assinatura de um método abstrato de uma interface funcional, realiza uma conversão implícita.
         * Ou seja, a lambda é automaticamente "convertida" para um objeto que implementa a interface Comparator<Anime>.
         */

        // Criando um objeto com get() do Supplier e referenciando o método comparador
        animeList.sort(animeComparatorsSupplier.get()::compareByEpisodesNonStatic);

        // Não consegui criar chamando o método, pois o mesmo pede argumentos
        // que no Method Reference tornan-se desnecessários, pois o mesmo
        // consegue iterar sobre a lista da outra forma
//        animeList.sort(animeComparators.get().compareByEpisodesNonStatic());

        System.out.println(animeList);

        // Quando um objeto recebe parâmetros no construtor, não é possível criá-lo
        // diretamente com o Supplier

        // Criando uma BiFunction que recebe 2 argumentos e retorna um
        // para poder criar um objeto Anime, que recebe parâmetros no construtor

        // Sintaxe com lambdas usando new() e BiFunction
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        // Sintaxe com method reference
        BiFunction<String, Integer, Anime> animeBiFunctionCreator = Anime::new;

        //Criando novos objetos do tipo Anime através do método apply()
        Anime anime = animeBiFunction.apply("Super Campeões", 36);
        Anime anime1 = animeBiFunctionCreator.apply("Saint Seyia", 144);

        animeList.add(anime);
        animeList.add(anime1);

        // Criando um objeto com get() do Supplier e referenciando o método comparador
        animeList.sort(animeComparatorsSupplier.get()::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
