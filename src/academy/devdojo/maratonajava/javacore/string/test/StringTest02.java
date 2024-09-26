package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Luffy Ramos   ";
        String frase = "Hello, World!";
        String numeros  = "012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace('f','l'));
        System.out.println(nome.replace("Lu","Ta"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(2));
        System.out.println(numeros.substring(1,5));
        System.out.println(nome.trim());
        System.out.println(frase.charAt(7));

    }
}
