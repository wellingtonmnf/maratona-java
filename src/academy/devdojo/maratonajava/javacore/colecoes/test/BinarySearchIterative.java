package academy.devdojo.maratonajava.javacore.colecoes.test;

public class BinarySearchIterative {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Calcula o ponto médio

            if (arr[mid] == key) {
                return mid; // Retorna o índice do elemento
            } else if (arr[mid] < key) {
                low = mid + 1; // Procura na metade direita
            } else {
                high = mid - 1; // Procura na metade esquerda
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Elemento encontrado no índice: " + result); //
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}

