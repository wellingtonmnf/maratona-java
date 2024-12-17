package academy.devdojo.maratonajava.javacore.exception.exception.teste;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
