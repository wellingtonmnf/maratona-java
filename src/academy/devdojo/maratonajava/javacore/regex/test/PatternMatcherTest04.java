package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco (incluíndo \t \n \f \r)
        // \S = Todos os caracteres, excluindo os em branco
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // [] = Conjunto/faixa de valores especificados
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n,m} = de n até m
        // () = grupo
        // | = ou ex: o (v|c) o retorna ovo oco
        // $ = Final da linha (string)
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("---------------------");
        System.out.println("RELATÓRIO");
        System.out.println("Texto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.println();
        System.out.print("---------------------");
    }
}