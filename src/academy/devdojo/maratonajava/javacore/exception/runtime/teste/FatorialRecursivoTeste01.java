package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class FatorialRecursivoTeste01 {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    // Método recursivo para calcular o fatorial
    public static int fatorial(int n) { //Debugar aqui para um melhor entendimento
        // Caso base: fatorial de 0 é 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: calcular o fatorial de n-1 e multiplicar por n
        else {
            /* Cada expressão e valor de n é guardada numa posição dentro de um array
             * criado de forma implícita pelo Java.
             * Por isso, quando o método retorna um valor, ele faz efeito retroativo
             * percorrendo as expressões armazenadas em cada expressão do array de
             * trás para frente, fazendo os cálculos das expressões e conseguindo assim
             * multiplicar os valores para achar o fatorial
             */
            return n * fatorial(n - 1);
        }
    }
}
