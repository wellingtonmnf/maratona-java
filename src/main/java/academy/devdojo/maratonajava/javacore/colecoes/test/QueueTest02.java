package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Helsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan",11.2,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));
        mangas.add(new Manga(11L,"Fullmetal Alchemist",2.99,0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
