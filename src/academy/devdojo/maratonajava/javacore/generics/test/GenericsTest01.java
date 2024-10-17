package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        // Antes do Generics (JDK 1.4)
        List lista = new ArrayList<>(); // A lista poderia receber qualquer objeto
        lista.add("Midoriya");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista){
            if (o instanceof String){ // Checagem de tipo para manipulação correta
                System.out.println(o);
            }
            if (o instanceof Long){
                System.out.println(o);
            }
            if (o instanceof Consumidor){
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
        }

        // A partir do Generics (JDK 1.5)
        List<String> novaLista = new ArrayList<>(); // Type erasure na execução da JVM
        novaLista.add("Midoriya");
        novaLista.add("Midoriya");

        add(novaLista, new Consumidor("Midoriya"));

        System.out.println(novaLista); // Imprime

        for (Object o : novaLista) { // Imprime por conta do objeto genérico
            System.out.println(o);
        }

        for (String s : novaLista) { // Não imprime por conta do objeto especificado
            System.out.println(s);
        }

    }

    private static void add (List lista, Consumidor consumidor){ // Lista sem tipo especificado
        lista.add(consumidor);
    }
}
