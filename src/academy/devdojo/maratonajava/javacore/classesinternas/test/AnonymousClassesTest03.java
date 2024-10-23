package academy.devdojo.maratonajava.javacore.classesinternas.test;

interface Saudacao {
    void mensagem();
}

public class AnonymousClassesTest03 {
    public static void main(String[] args) {

        // Classe interna anônima implementando a interface Saudacao
        Saudacao saudacao = new Saudacao() {
            @Override
            public void mensagem() {
                System.out.println("Olá, esta é uma classe interna anônima!");
            }
        };

        saudacao.mensagem();  // Saída: Olá, esta é uma classe interna anônima!
    }
}
