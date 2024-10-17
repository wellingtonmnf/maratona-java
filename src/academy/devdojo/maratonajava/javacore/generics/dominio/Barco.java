package academy.devdojo.maratonajava.javacore.generics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "Nome = '" + nome + '\'' +
                '}';
    }
}
