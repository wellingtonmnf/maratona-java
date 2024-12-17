package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;
    //MÉTODOS ACESSORES E MODIFICADORES
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double... salarios) {
        this.salarios = salarios;
    }

    private double getMedia() {
        return media;
    }

    private void setMedia(double media) {
        this.media = media;
    }
    //MÉTODOS PERSONALIZADOS
    public void imprimeDadosFuncionario() {
        System.out.println("###DADOS DO FUNCIONÁRIO###");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        this.mediaSalarios(this.salarios);
    }

    public void mediaSalarios(double[] sal) {
        if (sal == null) {
            return;
        }
        double soma = 0;
        for (int i = 0; i < sal.length; i++) {
            System.out.println("Salário nº " + (i + 1) + " é de R$ " + sal[i]);
            soma += sal[i];
        }
        this.media = soma / sal.length;
        System.out.println("A média dos salários é de R$ " + this.media);
    }
}
