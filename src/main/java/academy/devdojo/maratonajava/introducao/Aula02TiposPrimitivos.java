package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //boolean, char, byte, short, int, long, float, double
        int idade = (int) 10000000000l;
        int salario = (int) 1825.54;
        byte b = 127;
        short s = 32000;
        long l = 416841647;
        float f = 4114.358f;
        double d = 4183468.1487;
        char c = 42; //retorna valor da tabela ASCII
        char h = '\u0041';//retorna valor da tabela Unicode
        System.out.println("A idade é "+idade+" anos");
        System.out.println(salario);
        System.out.println(c);
        System.out.println(h);
    }
}
