package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.*;

public class MapInvertedKeyByValueTest01 {

    public static void main(String[] args) {

        /* Esse exercício visa obter uma solução para quando os valores em um Map não são exclusivos,
         * ou seja, várias chaves podem estar associadas ao mesmo valor.
         * É possível usar uma estrutura de dados que permita armazenar múltiplas chaves para um único valor.
         * Uma abordagem comum é usar um Map onde o valor é associado a uma coleção
         * (como uma List ou um Set) de chaves.
         * */

        // Mapa que associa valores a um conjunto de chaves
        Map<Integer, Set<String>> valueToKeysMap = new HashMap<>();

        // Adicionando algumas chaves e valores
        addKeyValue(valueToKeysMap, "Geeks", 10);
        addKeyValue(valueToKeysMap, "You", 30);
        addKeyValue(valueToKeysMap, "For", 30);
        addKeyValue(valueToKeysMap, "Geeks", 10); // Geeks já existe com o valor 10

        // Obtendo as chaves para um valor específico
        Set<String> keysForValue30 = getKeysByValue(valueToKeysMap, 30);
        System.out.println("As chaves para o valor 30 são: " + keysForValue30);

        Set<String> keysForValue10 = getKeysByValue(valueToKeysMap, 10);
        System.out.println("As chaves para o valor 10 são: " + keysForValue10);

        // Retorna um set vazio pois o valor específico não existe no mapa
        Set<String> keysForValue20 = getKeysByValue(valueToKeysMap, 20);
        System.out.println("As chaves para o valor 20 são: " + keysForValue20);
    }

    // Método para adicionar uma chave e valor ao mapa
    public static void addKeyValue(Map<Integer, Set<String>> map, String key, Integer value) {
        map.computeIfAbsent(value, k -> new HashSet<>()).add(key);
    }

    // Método para obter as chaves associadas a um valor
    public static Set<String> getKeysByValue(Map<Integer, Set<String>> map, Integer value) {
        return map.getOrDefault(value, Collections.emptySet());
    }
}
