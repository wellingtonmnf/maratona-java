package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Yusuke";
        estudante01.idade = 14;
        estudante01.sexo = 'M';


        estudante02.nome = "Keiko";
        estudante02.idade = 13;
        estudante02.sexo = 'F';


        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        /*
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("------------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        */
    }
}
