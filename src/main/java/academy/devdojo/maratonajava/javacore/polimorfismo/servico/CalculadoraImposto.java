package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculaImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("RELATÓRIO DE IMPOSTO PARA PRODUTO");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: R$ " + produto.getValor());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor final: R$ " + (produto.getValor() + imposto));
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade: " + dataValidade);
        }
        System.out.println("---------------------------------");
    }
}
