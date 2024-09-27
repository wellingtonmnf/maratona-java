package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ACB1","iPhone");
        Smartphone s2 = new Smartphone("22222","Pixel");
        Smartphone s3 = new Smartphone("33333","Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);// Adiciona o objeto na posição 0 da lista
        // smartphones.clear(); // Limpa o array sem perder a variável de referência

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone); //Imprime cada item da lista
        }

        Smartphone s4 = new Smartphone("22222333","Pixel"); // Tentando inserir um objeto 'já existente'
        System.out.println(smartphones.contains(s4)); // contains() chama automaticamente o equals(), que foi sobrescrito na classe Smartphone
//        smartphones.add(s4);

        int indexSmartphone4 = smartphones.indexOf(s4); // procura o objeto na lista e joga numa variável
        System.out.println(indexSmartphone4); // Não achando o objeto, retorna a posição -1
        System.out.println(smartphones.get(indexSmartphone4)); // Imprime o objeto da lista na posição guardada na variável obtida com indexOf()
    }
}
