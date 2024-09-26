package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        //CRIAÇÃO E INICIALIZAÇÃO DE VARIÁVEIS
        Time time1 = new Time("Brasil");
        Time time2 = new Time("Argentina");
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Rivaldo");
        Jogador jogador4 = new Jogador("Maradona");
        Jogador jogador5 = new Jogador("Messi");
        Jogador jogador6 = new Jogador("Riquelme");
        Jogador[] jogadoresTime1 = {jogador1,jogador2,jogador3};
        Jogador[] jogadoresTime2 = {jogador4,jogador5,jogador6};
        //ASSOCIAÇÃO DE CLASSES
        time1.setJogadores(jogadoresTime1);
        time2.setJogadores(jogadoresTime2);
        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);
        jogador4.setTime(time2);
        jogador5.setTime(time2);
        jogador6.setTime(time2);
        //IMPRESSÃO DE VALORES
        System.out.println("### Times ###");
        time1.imprime();
        System.out.println("-------");
        time2.imprime();

        System.out.println("### Jogadores ###");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();
        jogador5.imprime();
        jogador6.imprime();


    }
}
