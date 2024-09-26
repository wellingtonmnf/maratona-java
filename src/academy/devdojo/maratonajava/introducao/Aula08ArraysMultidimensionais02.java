package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];
        int[] numeros = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = numeros;
        arrayInt[2] = new int[] {1,2,3,4,5,6};

        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int[] arrBase : arrayInt){
            for (int num : arrBase){
                System.out.print(num+" ");
            }
            System.out.println("\n-----");
        }

        for(int[] arrBase : arrayInt2){
            for (int num : arrBase){
                System.out.print(num+" ");
            }
            System.out.println("\n-----");
        }
    }
}
