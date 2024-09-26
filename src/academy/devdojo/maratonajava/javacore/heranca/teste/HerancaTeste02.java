package academy.devdojo.maratonajava.javacore.heranca.teste;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste02 {

    // O0 - Cada atributo estático da superclasse é executado quando a JVM carregar a superclasse
    // 01 - Blocos de inicialização estáticos da superclasse são executados, na ordem em que aparecem, quando a JVM carregar a superclasse
    // 02 - Cada atributo estático da subclasse é executado quando a JVM carregar subclasse
    // 03 - Blocos de inicialização estáticos da subclasse são executados, na ordem em que aparecem, quando a JVM carregar subclasse
    // 04 - Alocado espaco em memória pro objeto da superclasse
    // 05 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer que tenha sido passado
    // 06 - Blocos de inicialização da superclasse são executados na ordem em que aparecem
    // 07 - Construtor é executado da superclasse
    // 08 - Alocado espaco em memória pro objeto da subclasse
    // 09 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer que tenha sido passado
    // 10 - Blocos de inicialização da subclasse são executados na ordem em que aparecem
    // 11 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
