package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        //CRIAÇÃO E INICIALIZAÇÃO DE ENDEREÇO
        Endereco endereco1 = new Endereco("Avenida Nestor Duarte",198,"Salvador");
        Endereco endereco2 = new Endereco("Rua da Fonte do Boi",1,"Salvador");
        Endereco endereco3 = new Endereco("Avenida Luis Viana Filho",250,"Salvador");
        //CRIAÇÃO E INICIALIZAÇÃO DE SEMINÁRIOS
        Seminario seminario1 = new Seminario("Apex Salesforce",endereco1);
        Seminario seminario2 = new Seminario("Java POO",endereco2);
        Seminario seminario3 = new Seminario("Python Básico",endereco3);
        //CRIAÇÃO E INICIALIZAÇÃO DE PROFESSORES
        Professor professor1 = new Professor("Willian Suane","Java");
        Professor professor2 = new Professor("Gustavo Guanabara","Python");
        //CRIAÇÃO E INICIALIZAÇÃO DE ESTUDANTES
        Estudante estudante1 = new Estudante("Wellington",34);
        Estudante estudante2 = new Estudante("João",15);
        Estudante estudante3 = new Estudante("Maria",15);
        //ATRIBUIÇÃO E ASSOCIAÇÃO
        //ESTUDANTE
        Estudante[] estudantesSeminario1 = new Estudante[] {estudante1};
        Estudante[] estudantesSeminario2 = new Estudante[5];
        Estudante[] estudantesSeminario3 = new Estudante[] {estudante2,estudante3};

        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario3);
        estudante3.setSeminario(seminario3);
        //SEMINÁRIO
        seminario1.setEstudantes(estudantesSeminario1);
        seminario1.setProfessor(professor2);
        seminario2.setEstudantes(estudantesSeminario2);
        seminario2.setProfessor(professor1);
        seminario3.setEstudantes(estudantesSeminario3);
        seminario3.setProfessor(professor2);
        //PROFESSOR
        Seminario[] seminariosProfessor1 = new Seminario[] {seminario2};
        Seminario[] seminariosProfessor2 = new Seminario[] {seminario1, seminario3};

        professor1.setSeminarios(seminariosProfessor1);
        professor2.setSeminarios(seminariosProfessor2);
        //RELATÓRIOS
        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();
        estudante1.imprime();
        professor1.imprime();
        professor2.imprime();

    }
}
