package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução para concatenar strings c/ concatString: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução para concatenar strings c/ StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução para concatenar strings c/ StringBuffer: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(1);
        }
    }
}
