package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tratando exceção do tipo ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tratando exceção do tipo IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Tratando exceção do tipo ArithmeticException");
        } catch (IllegalArgumentException e) {
            System.out.println("Tratando exceção do tipo IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Tratando exceção do tipo RuntimeException");
        }

        try {
            talvezLanceExcecao();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("Tratando exceções de forma conjunta");
        }

    }

    private static void talvezLanceExcecao() throws SQLException, FileNotFoundException {

    }
}
