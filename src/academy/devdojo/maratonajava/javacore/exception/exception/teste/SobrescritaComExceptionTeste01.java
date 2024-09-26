package academy.devdojo.maratonajava.javacore.exception.exception.teste;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
