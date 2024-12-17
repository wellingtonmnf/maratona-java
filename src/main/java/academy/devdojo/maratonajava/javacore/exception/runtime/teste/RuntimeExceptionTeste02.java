package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("O programa não parou até aqui");
    }

    /**
     *
     * @param a
     * @param b valor não pode ser = 0
     * @return
     * @throws IllegalArgumentException caso b = 0
     */
    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. O valor não pode ser 0");
        }
        return a / b;
    }
}
