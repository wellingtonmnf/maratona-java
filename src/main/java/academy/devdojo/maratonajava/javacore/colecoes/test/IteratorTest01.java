package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Helsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan",11.2,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));

//        O código abaixo gera uma ConcurrentModificationException
//        for (Manga manga : mangas) {
//            if(manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }
//        }

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }

//        Sintaxe simplificada
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        // Sintaxe de programação funcional (Java 8)
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}