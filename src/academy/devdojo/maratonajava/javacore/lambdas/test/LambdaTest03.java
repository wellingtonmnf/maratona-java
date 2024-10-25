package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest03 {
    public static void main(String[] args) {

        // A interface Supplier não recebe nenhum tipo,
        // processa o parâmetro e retorna um tipo de objeto

        // Supplier que gera números aleatórios
        Supplier<Double> randomSupplier = () -> Math.random();

        // Gera uma lista de 5 números aleatórios
        List<Double> numerosAleatorios = Stream.generate(randomSupplier)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(numerosAleatorios); // Exemplo de saída: [0.432, 0.876, 0.123, ...]

        System.out.println("-----------------");
        // Supplier que gera a mensagem 'Olá, mundo'
        Supplier<String> mensagem = () -> "Olá, mundo!";
        System.out.println(mensagem.get()); // Saída: Olá, mundo!

        System.out.println("-----------------");
        // Supplier que gera a data atual do sistema
        Supplier<Date> dataAtual = Date::new;
        System.out.println(dataAtual.get()); // Saída: data atual

    }
}
