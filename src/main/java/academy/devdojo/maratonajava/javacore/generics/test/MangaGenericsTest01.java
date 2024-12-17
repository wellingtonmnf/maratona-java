package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaGenericsTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Helsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan",11.2,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));

        imprimeMangas(mangas);

        List<Consumidor> consumidores = new ArrayList<>();
        consumidores.add(new Consumidor("Wellington"));
        consumidores.add(new Consumidor("Milena"));
        consumidores.add(new Consumidor("Maria Lúcia"));
        consumidores.add(new Consumidor("Miguel"));
        consumidores.add(new Consumidor("Marcel"));

//        imprimeMangas(consumidores); // Erro, pois não implementa 'Comparable'
    }

    public static void imprimeMangas (List<? extends Comparable> mangas){

        Collections.sort(mangas);

        for (Comparable manga : mangas){
            System.out.println(manga);
        }
    }
}
