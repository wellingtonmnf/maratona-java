package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
            } else {
                break;
            }
            System.out.println("Contando "+parcela);
            //O código abaixo poderia resultar numa solução ainda mais simples
            /* if (valorParcela < 1000) {
             *    break;
             *  }
             *  System.out.println("Parcela "+parcela+" R$ "+valorParcela);
             */
        }

    }
}
