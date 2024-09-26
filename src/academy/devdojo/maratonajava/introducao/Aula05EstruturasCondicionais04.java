package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioBruto, salarioLiquido, valorImposto;
        String aliquotaImposto, resposta;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Informe o salário: R$ ");
            salarioBruto = in.nextDouble();

            if (salarioBruto <= 34712) {
                aliquotaImposto = "9,70%";
                valorImposto = ((salarioBruto * 9.7) / 100);
                salarioLiquido = salarioBruto - valorImposto;
            } else if (salarioBruto > 34712 && salarioBruto <= 68507) {
                aliquotaImposto = "37,35%";
                valorImposto = ((salarioBruto * 37.35) / 100);
                salarioLiquido = salarioBruto - valorImposto;
            } else {
                aliquotaImposto = "49,5%";
                valorImposto = ((salarioBruto * 49.5) / 100);
                salarioLiquido = salarioBruto - valorImposto;
            }
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Alíquota: " + aliquotaImposto);
            System.out.println("Valor do imposto: " + valorImposto);
            System.out.println("Salário líquido: " + salarioLiquido);

            do {
                System.out.println("Quer continuar? [S/N]");
                resposta = in.nextLine().toUpperCase();
                System.out.println(resposta);
                if (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Resposta inválida! Insira uma resposta válida");
                }
            } while (!resposta.equals("S") && !resposta.equals("N"));

        } while (resposta.equals("S"));
    }
}
