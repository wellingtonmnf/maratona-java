package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();;
    }
}
