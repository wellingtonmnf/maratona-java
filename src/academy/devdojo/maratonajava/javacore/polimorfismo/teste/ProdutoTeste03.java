package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto computador = new Computador("SuperFrame Ryzen 5 8600G", 9000);
        Tomate tomate = new Tomate("Tomate Cereja", 8);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(computador);
    }
}
