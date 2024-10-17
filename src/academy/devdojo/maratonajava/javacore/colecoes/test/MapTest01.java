package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        /* Um Map é um CONJUNTO que faz associação do tipo chave-valor, onde:
         * as chaves são do tipo Set (não permitem duplicatas)
         * os valores são do tipo Collections (permitem duplicatas)
         */
        Map<String,String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.putIfAbsent("vc","você2");
        map.put("vc2","você");
        System.out.println(map);
        System.out.println("-------------");
        // Retornar chaves e valores do map
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("-------------");
        // Retornar valores do map
        for (String value : map.values()){
            System.out.println(value);
        }
        System.out.println("-------------");
        // Retornar conjunto de chaves-valores do map
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
