package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;

    public Endereco(String logradouro, int numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public void imprime() {
        System.out.println(this.logradouro + ", " + this.numero + " - " + this.cidade);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

