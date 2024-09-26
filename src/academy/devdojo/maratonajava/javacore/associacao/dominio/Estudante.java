package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("### ESTUDANTE ###");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminario == null) return;
        System.out.println("Seminário: " + this.seminario.getTitulo());
        System.out.println("Endereço: ");
        this.seminario.getEndereco().imprime();
        System.out.println("Professor: " + this.seminario.getProfessor().getNome());
        System.out.println("---------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
