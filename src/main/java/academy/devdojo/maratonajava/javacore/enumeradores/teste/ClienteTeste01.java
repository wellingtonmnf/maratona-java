package academy.devdojo.maratonajava.javacore.enumeradores.teste;

import academy.devdojo.maratonajava.javacore.enumeradores.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enumeradores.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.enumeradores.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Wellington", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Embasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);

    }
}
