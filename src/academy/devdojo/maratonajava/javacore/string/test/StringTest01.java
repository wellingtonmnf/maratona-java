package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Wellington";
        String nome2 = "Wellington";
        nome.concat(" Morais");
        System.out.println(nome == nome2);
        System.out.println(nome);
        nome = nome + " Morais";
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Wellington");
        /*
          1 - cria variável de referência
          2 - Instancia objeto do tipo String
          3 - Referencia string imutável no String Pool p/ variável de referência
         */
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
