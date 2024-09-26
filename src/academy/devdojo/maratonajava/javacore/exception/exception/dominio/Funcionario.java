package academy.devdojo.maratonajava.javacore.exception.exception.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Funcionario extends Pessoa {

    public void salvar() throws RuntimeException {
        System.out.println("Salvando funcionário");
    }
}
