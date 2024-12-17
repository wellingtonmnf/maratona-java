package academy.devdojo.maratonajava.javacore.serializacao.test;

import academy.devdojo.maratonajava.javacore.serializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.serializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L,"Wellington Morais","123456789");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void desserializar(){
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}