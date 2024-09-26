package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime() {
        System.out.println(getNome());
        System.out.println(getIdade());
    }
}
