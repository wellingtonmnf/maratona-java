package academy.devdojo.maratonajava.javacore.exception.exception.teste;

import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivoProprio();
    }

    public static void lerArquivoProprio(){
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo(){
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
