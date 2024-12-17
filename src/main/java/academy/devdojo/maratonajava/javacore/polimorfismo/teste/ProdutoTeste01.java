package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("SuperFrame Ryzen 5 8600G", 9000);
        Tomate tomate = new Tomate("Tomate Cereja", 8);
        CalculadoraImposto.calculaImposto(computador);
        CalculadoraImposto.calculaImposto(tomate);
    }
}
