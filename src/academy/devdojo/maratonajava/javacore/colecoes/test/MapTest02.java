package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        // Criando consumidores
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        // Criando mangás
        Manga manga1 = new Manga(5L, "Helsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.2);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);
        // Criando e carregando o mapa
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        // Imprimindo usando keySet()
        for (Consumidor consumidor : consumidorManga.keySet()) {
            System.out.println(consumidor.getNome() + " : " + consumidorManga.get(consumidor));
        }
        System.out.println("---------------------");
        // Imprimindo usando entrySet()
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}
