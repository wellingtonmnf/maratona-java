package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Helsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch1 = new Manga(2L, "Dragon Ball Z", 2.99);
        Manga mangaToSearch2 = new Manga(6L, "Fullmetal Alchemist", 4.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch1, mangaByIdComparator));
        System.out.println(Collections.binarySearch(mangas, mangaToSearch2, mangaByIdComparator));
    }
}