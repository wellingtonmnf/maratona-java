package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest02 {
    public static void main(String[] args) {
        double soma = somarNumeros(5, 7.2);
        System.out.println(soma);
    }

    private static <T extends Number, U extends Number> double somarNumeros(T t, U u){
        return t.doubleValue() + u.doubleValue();

    }
}