package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * / %
        int n1 = 10, n2 = 20;
        double r = n1 / (double) n2;
        System.out.println(r);

        // && || !

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612f;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381f;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlayStation = 5000;
        boolean isPlayStationCompravel = valorContaCorrente > valorPlayStation || valorContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCompravel "+isPlayStationCompravel);

        // = += -= *= /= %=
        float bonus = 1800f;
        bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /=2;
        bonus %=2; //bonus = bonus % 2;
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(++contador);

    }

}
