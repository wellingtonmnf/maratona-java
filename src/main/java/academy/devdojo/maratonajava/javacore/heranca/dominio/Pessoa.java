package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização 01 de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização 02 de Pessoa");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de Pessoa");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getLogradouro() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
