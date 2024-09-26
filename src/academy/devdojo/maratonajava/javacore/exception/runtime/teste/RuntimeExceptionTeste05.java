package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Tratando exceção de forma genérica");
            //e = new ArrayIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tratando exceção do tipo IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Tratando exceção do tipo RuntimeException");
        }

        try {
            talvezLanceExcecao();
        } catch (FileNotFoundException | SQLException e) {
            System.out.println("Tratando exceções de forma conjunta");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    private static void talvezLanceExcecao() throws FileNotFoundException, SQLException {

    }


}
