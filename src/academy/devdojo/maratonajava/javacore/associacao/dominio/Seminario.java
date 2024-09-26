package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Seminario {
    private String titulo;
    private Endereco endereco;
    private Estudante[] estudantes;
    private Professor professor;

    public Seminario(String titulo, Endereco endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("### SEMINÁRIO ###");
        System.out.println("Título: " + this.titulo);
        System.out.println("Endereço: ");
        this.endereco.imprime();
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Estudantes: ");
        if (estudantes == null) return;
        for (Estudante estudante : estudantes) {
            if (estudante == null) {
                continue;
            }
            System.out.println(estudante.getNome());
        }
        System.out.println("---------------------------");

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
