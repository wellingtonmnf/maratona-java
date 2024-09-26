package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . = 1.3 retorna 123, 133, 1@3, 1A3
        String regex = "([0-9a-zA-Z\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // [0-9a-zA-Z\._-])+ Pesquisa por um ou mais caracteres alfanuméricos, além de ._-,
        // @([a-zA-Z])+ Verifica se tem um @ e depois pesquisa por um ou mais caracteres alfabéticos
        // (\\.([a-zA-Z])+)+ Pesquisa por um . e depois um ou mais caracteres alfabéticos, e permite a repetição desse padrão
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        // Separação padrão de valores num array de strings é por vírgula
        System.out.println("Email válido");
        System.out.println("#@!zoro@mail.com".matches(regex)); // Combina a string com o padrão passado por parâmetro
        System.out.println(texto.split(",")[1].trim());
        // Divide a string em um array de posições definidas através do separador ','
        // e pega a posição 1 do array, eliminando espaços em branco
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println();
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