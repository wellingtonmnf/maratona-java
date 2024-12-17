package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(4);
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção)-1) // Lógica do Binary Search

        // index   [0,1,2,3]
        // value   [0,2,3,4]
        // natural [2,0,4,3]

        Collections.sort(numeros); // Sem ordenamento, o resultado do Binary Search não é confiável

        System.out.println(Collections.binarySearch(numeros,0));
        System.out.println(Collections.binarySearch(numeros,1));
        System.out.println(Collections.binarySearch(numeros,-1));
    }
}