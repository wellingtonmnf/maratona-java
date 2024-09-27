package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

//        List nomes = new ArrayList<>(); // Até a versão 1.4 do Java era feito dessa forma

        List<String> nomes = new ArrayList<>(); // A partir da versão 1.5 do Java, foi implementado o uso da 'diamond syntax'
        nomes.add("William");
        nomes.add("DevDojo");
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2); // Adiciona toda a lista 'nomes2' à lista 'nomes'

        System.out.println(nomes.remove("william")); //Remove pelo índice ou por um objeto dado (exatamente igual). O retorno é boolean

//        for (Object nome: nomes){ // Java 1.4
//            System.out.println(nome);
//        }

        for (String nome: nomes){ // Java 1.5
            System.out.println(nome);
        }

        nomes.add("Wellington"); // Listas são auto-incrementáveis

        System.out.println("---------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // O QUE NÃO É PERMITIDO FAZER

//        for (String nome: nomes){
//            System.out.println(nome);
//            nomes.add("Suane"); // Exceção! O foreach utiliza o size para predefinir o tamanho da lista. Não pode auto-incrementar dessa maneira
//        }
//
//        System.out.println("---------------");
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//            nomes.add("Suane"); // Looping infinito
//        }
//
//        List<int> numbers = new ArrayList<>(); // Não é possível usar tipos primitivos em coleções. As mesmas usam métodos como equals() e hashCode()

        // FIM DO QUE NÃO É PERMITIDO FAZER

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);
    }
}
