package academy.devdojo.maratonajava.javacore.cassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.cassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.cassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gohan", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Trunks", 8000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
