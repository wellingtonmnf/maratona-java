package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Wellington");
        funcionario.setIdade(34);
        funcionario.setSalarios(2500.64,5730.28,10640.70,12370.80,15670.32,14253.95);
        /*
        funcionario.salario[0] = 2500.64;
        funcionario.salario[1] = 5730.28;
        funcionario.salario[2] = 10640.70;
        funcionario.salario[3] = 12370.80;
        */
        funcionario.imprimeDadosFuncionario();
    }
}
