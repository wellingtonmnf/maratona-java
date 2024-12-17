package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObj(new Barco("Canoa Marota"));
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Serena"));
        System.out.println(barcoList);

    }

    private static <T> void criarArrayComUmObj(T t){
        List<T> list = new ArrayList<>(); // Array dinâmico
        list.add(t);
        System.out.println(list);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t); // Array imutável
    }
    // O método agora só recebe objetos que implementam Comparable
    // (no caso, coleções ordenadas)
//    private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){
//        return List.of(t);
//    }
}
