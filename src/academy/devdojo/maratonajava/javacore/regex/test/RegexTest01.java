package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {

        String regex = "\\bcat\\B";
        String texto = "caterpillar scat cat";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

//        String[] result = pattern.split("one1two2three");
//        System.out.println(Arrays.toString(result));
//
//        String[] split = texto.split("a");
//        System.out.println(Arrays.toString(split));


        System.out.println("---------------------");
        System.out.println("RELATÓRIO");
        System.out.println("Texto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.print("---------------------");
    }
}