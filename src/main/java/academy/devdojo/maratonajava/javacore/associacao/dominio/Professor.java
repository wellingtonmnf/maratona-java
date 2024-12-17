package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public void imprime() {
            System.out.println("### PROFESSOR ###");
            System.out.println("Nome: " + this.nome);
            System.out.println("Especialidade: " + this.especialidade);
            for (Seminario seminario : seminarios) {
                System.out.println("Seminário: " + seminario.getTitulo());
                System.out.println("Endereço: ");
                seminario.getEndereco().imprime();
                System.out.println("Estudantes: ");
                for (Estudante estudante : seminario.getEstudantes()) {
                    if (estudante == null) continue;
                    System.out.println(estudante.getNome());
                }

            }
            System.out.println("---------------------------");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        if (seminarios == null) return;
        this.seminarios = seminarios;
    }
}
