package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
//        arrayToList.add(19); //Unssuported operation exception
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("----------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        System.out.println("----------------");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); //Criar lista de inteiros em apenas uma linha
        List<String> strings = Arrays.asList("1", "2", "3"); //Criar lista de strings em apenas uma linha
        List<Integer> integers1 = List.of(1, 2, 3, 4); //Criar lista de inteiros em apenas uma linha a patir do Java 9
    }
}
