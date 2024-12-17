package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto computador = new Computador("SuperFrame Ryzen 5 8600G", 9000);
        Produto tomate = new Tomate("Tomate Cereja", 8);
        Produto tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calculaImposto(computador);
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(tv);
    }
}
