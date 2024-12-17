package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos so números pares de 0 a 1000000
        for(int num=0;num<=1000000;num++){
            if (num%2==0){
                System.out.println(num);
            }
        }
    }
}
