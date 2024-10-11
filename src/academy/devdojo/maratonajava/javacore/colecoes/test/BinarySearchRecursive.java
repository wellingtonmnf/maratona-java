package academy.devdojo.maratonajava.javacore.colecoes.test;

public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2; // Calcula o ponto médio

            if (arr[mid] == key) {
                return mid; // Retorna o índice do elemento
            } else if (arr[mid] < key) {
                return binarySearch(arr, mid + 1, high, key); // Metade direita
            } else {
                return binarySearch(arr, low, mid - 1, key); // Metade esquerda
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binarySearch(arr, 0, arr.length -1, key);

        if (result != -1) {
            System.out.println("Elemento encontrado no índice: " + result);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}