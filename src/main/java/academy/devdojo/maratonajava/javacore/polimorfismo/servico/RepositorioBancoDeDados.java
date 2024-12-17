package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
