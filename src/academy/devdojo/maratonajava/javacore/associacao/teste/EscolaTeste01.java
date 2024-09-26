package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Tsunade");
        Professor[] professores = {professor1,professor2,professor3};
        Escola escola1 = new Escola("Konoha",professores);
        escola1.imprime();
    }
}
