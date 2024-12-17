package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[12][1];
        dias[0][0] = 31;
        dias[1][0] = 28;
        dias[2][0] = 31;
        dias[3][0] = 30;
        dias[4][0] = 31;
        dias[5][0] = 30;
        dias[6][0] = 31;
        dias[7][0] = 31;
        dias[8][0] = 30;
        dias[9][0] = 31;
        dias[10][0] = 30;
        dias[11][0] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("O mês " + (i+1) + " possui " + dias[i][j] + " dias");
            }

        }

        System.out.println("----------------------");
        //Uma esstrutura for lê os VALORES dentro de cada array,
        //não os tipos de variáveis em sí

        //Varre o array e retorna outro array na referência de memória
        for (int[] arrBase : dias){
            //Varre o array e retorna números inteiros nos espaços do array
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}