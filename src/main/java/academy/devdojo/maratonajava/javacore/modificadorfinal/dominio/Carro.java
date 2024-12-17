package academy.devdojo.maratonajava.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE= 250;
    public final Comprador COMPRADOR;

    {
        COMPRADOR = new Comprador();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
