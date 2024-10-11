package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.Arrays;

public class BinarySearchNegativeExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9}; // O array deve estar ordenado

        // Tenta buscar o número 4, que não existe no array
        int result = Arrays.binarySearch(arr, 4);

        System.out.println("Resultado da busca: " + result); // Imprime um valor negativo (-3)

        if (result < 0) {
            // Calcula a posição de inserção
            int insertionPoint = -(result) - 1;
            System.out.println("Elemento não encontrado. Ele pode ser inserido no índice: " + insertionPoint);
        }
    }
}