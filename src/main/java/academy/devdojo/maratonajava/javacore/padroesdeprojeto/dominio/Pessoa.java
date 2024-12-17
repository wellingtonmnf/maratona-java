package academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String apelido;
    private String email;

    private Pessoa(String nome, String sobrenome, String apelido, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String apelido;
        private String email;

        private PessoaBuilder() {
        }

        public static PessoaBuilder builder() {
            return new PessoaBuilder();
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, sobrenome, apelido, email);
        }
    }
}
