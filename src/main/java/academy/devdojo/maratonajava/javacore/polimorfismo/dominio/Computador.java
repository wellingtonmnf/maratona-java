package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
