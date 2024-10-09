package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId()); // Metodo 'compareTo()' de Long
        /*
        Neste exemplo, o metodo compareTo() utilizado não é o da classe Manga,
        mas sim o da Wrapper Class Long, pois manga1.getId() retorna um Long,
        que por sua vez possui o metodo compareTo() já implementado internamente
        para fazer o ordenamento de acordo com o solicitado em Comparator.
        */
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Helsing Ultimate",19.9));
        mangas.add(new Manga(1L,"Berserk",9.5));
        mangas.add(new Manga(4L,"Pokemon",3.2));
        mangas.add(new Manga(3L,"Attack on Titan",11.2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}