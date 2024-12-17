package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Person;
import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Pessoa;

public class BuilderPatternTest01 {

    public static void main(String[] args) {

        Person build =  new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(build);
        // Como o construtor do PessoaBuilder é privado, o objeto não pode ser instanciado
        Pessoa pessoa = Pessoa.PessoaBuilder
                .builder()
                .nome("Wellington")
                .sobrenome("Morais")
                .apelido("wellingtonmnf")
                .email("wellingtonmnf@outlook.com")
                .build();

        System.out.println(pessoa);

    }

}
