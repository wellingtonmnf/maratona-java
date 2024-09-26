package academy.devdojo.maratonajava.javacore.heranca.teste;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wellington");
        pessoa.setCpf("123456789-10");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Av. Nestor Duarte");
        endereco.setCep("40000-000");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Milena");
        funcionario.setCpf("000111222-33");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000);

        pessoa.imprime();
        System.out.println("------------");
        funcionario.imprime();

    }
}
