package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class ConsumidorComparator implements Comparator<Consumidor>{

    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class NavigableMapTest01 {
    public static void main(String[] args) {
        /* Assim como o TreeSet ordena as coleções
         * através do Comparable ou do Comparator,
         * o TreeMap também se utiliza da mesma regra
         * porém apenas atrelada a CHAVE
         */
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("---------------------");

        // lower imediatamente < que o item comparado
        // floor imediatamente <= que o item comparado
        // higher imediatamente > que o item comparado
        // ceiling imediatamente >= que o item comparado
        System.out.println(map.headMap("C")); // Está linkado com o map, assim como o método asList()
        System.out.println(map.headMap("C", true)); // Inclusivo com o valor
        System.out.println(map.tailMap("C"));
        System.out.println(map.tailMap("C", false)); // Exclusivo com o valor
        System.out.println(map.subMap("B", "D")); // Está linkado com o map, assim como o método asList()
        System.out.println(map.subMap("B", true, "D", true)); // Inclusivo com os valores

        System.out.println("---------------------");

        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));

        System.out.println("---------------------");

        // A classe Consumidor não possui implementação de Comparable
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        // Sem um Comparator, a execução lançaria uma ClassCastException
        NavigableMap<Consumidor, String> consumidorStringMap = new TreeMap<>(new  ConsumidorComparator());
        consumidorStringMap.put(consumidor1, "A");

        for (Map.Entry<Consumidor, String> entry : consumidorStringMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue());
        }

    }
}
