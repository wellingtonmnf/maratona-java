package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
//        set.add(smartphone); //Gera uma ClassCastException pois Smartphone não possui a interface 'Comparable'
        set.add(smartphone); // Funciona pq passou um Comparator
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Helsing Ultimate",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Pokemon",3.2,0));
        mangas.add(new Manga(3L,"Attack on Titan",11.2,2));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99,0));
        // Os elementos abaixo não serão inseridos pois a referência agora é o Comparator
        // 'MangaPrecoComparator' e existem valores de preço duplicados

        // Aqui só funcionaria se fosse a ordem natural (Comparable de Manga)
        mangas.add(new Manga(10L,"Aaragon",2.99,0)); //Entra no conjunto
        mangas.add(new Manga(11L,"Aaragon",2.99,0)); //Entra no conjunto pq mudou o ID
        mangas.add(new Manga(10L,"Aaragon2",2.99,0)); //Entra no conjunto pq mudou o nome
        mangas.add(new Manga(10L,"Aaragon",2.99,0)); //NÃO Entra no conjunto pq é igual
        // Checar implementação do 'compareTo()' na classe Manga para entender

        mangas.add(new Manga(11L,"Fullmetal Alchemist",2.99,0));//NÃO Entra no conjunto pq o preço é duplicado
        //Imprime baseado na ordem natural definida no compareTo() dentro de Manga ou do Comparator
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("------------------");
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }
        System.out.println("------------------");

        Manga yuyu = new Manga(21L,"Yu Yu Hakusho",3.2,5);
        System.out.println(mangas.lower(yuyu)); // lower imediatamente < que o item comparado
        System.out.println(mangas.floor(yuyu)); // floor imediatamente <= que o item comparado
        System.out.println(mangas.higher(yuyu)); // higher imediatamente > que o item comparado
        System.out.println(mangas.ceiling(yuyu)); // ceiling imediatamente >= que o item comparado
        System.out.println("------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // pollFirst: RETIRA e retorna o elemento no topo do conjunto
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // pollLast: RETIRA e retorna o elemento no fim do conjunto
        System.out.println(mangas.size());

    }
}
