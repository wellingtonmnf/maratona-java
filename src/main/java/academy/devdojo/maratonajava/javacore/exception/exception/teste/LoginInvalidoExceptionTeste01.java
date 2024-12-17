package academy.devdojo.maratonajava.javacore.exception.exception.teste;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Usuário: ");
        String usernameInput = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaInput = teclado.nextLine();

        if (!usernameInput.equals(usernameDB) || !senhaInput.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário e/ou senha inválido(a)");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
