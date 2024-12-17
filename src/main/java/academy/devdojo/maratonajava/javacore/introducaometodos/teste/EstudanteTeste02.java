package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Yusuke";
        estudante01.idade = 14;
        estudante01.sexo = 'M';
        estudante01.imprime();

        estudante02.nome = "Keiko";
        estudante02.idade = 13;
        estudante02.sexo = 'F';
        estudante02.imprime();
    }
}
