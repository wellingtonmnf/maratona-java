package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco (incluíndo \t \n \f \r)
        // \S = Todos os caracteres, excluindo os em branco
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        String regex1 = "\\d"; // Tem que usar 2 contra-barras, pois se trata de um caractere de escape
        String regex2 = "\\W";
        String texto1 = "@#1d_S7 t4";
        String texto2 = "@#1d_S7 t4";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(texto1);
        Matcher matcher2 = pattern2.matcher(texto2);
        System.out.println("RELATÓRIO");
        System.out.println("Texto:  " + texto1);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex1);
        System.out.println("Posições encontradas:");
        while (matcher1.find()) {
            System.out.print(matcher1.start() + " " + matcher1.group() + "\n");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("RELATÓRIO");
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Posições encontradas:");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + " " + matcher2.group() + "\n");
        }
        System.out.println();
        System.out.print("---------------------");
    }
}