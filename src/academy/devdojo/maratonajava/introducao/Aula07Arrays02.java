package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long = 0
        //float, double = 0.0
        //char = '\u0000' (caractere vazio na tabela unicode)
        //boolean = false
        //String = null;
        String[] nomes = new String[3];
        nomes[0] = "Yusuke";
        nomes[1] = "Kwabara";
        nomes[2] = "Botan";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
