package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor proefssor = new Professor();
        proefssor.nome = "Meste Kami";
        proefssor.idade = 140;
        proefssor.sexo = 'M';
        System.out.println("Nome: "+proefssor.nome+" idade: "+proefssor.idade+" sexo: "+proefssor.sexo);
    }
}
