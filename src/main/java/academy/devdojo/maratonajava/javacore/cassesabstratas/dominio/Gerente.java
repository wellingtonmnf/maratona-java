package academy.devdojo.maratonajava.javacore.cassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente [Nome: " + this.nome + " | Salário: " + this.salario + "]";
    }
}
