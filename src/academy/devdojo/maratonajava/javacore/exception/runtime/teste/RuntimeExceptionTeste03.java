package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abrirConexao();
        abrirConexao2();
    }

    private static void abrirConexao() {
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Editando arquivo");
            throw new RuntimeException("Padrão");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando conexão");
        }

    }

    private static void abrirConexao2() {
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Editando arquivo");
            throw new RuntimeException("Padrão");
        } finally {
            System.out.println("Fechando conexão");
        }
    }
}
