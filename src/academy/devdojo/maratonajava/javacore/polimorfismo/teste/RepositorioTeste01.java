package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();

        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
