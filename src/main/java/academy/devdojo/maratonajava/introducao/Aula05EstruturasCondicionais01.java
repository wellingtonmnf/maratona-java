package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        if (true){
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;

        if (isAutorizadoComprarBebidaAlcoolica){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebidaAlcoolica){
            System.out.println("Não autorizado a comprar bebida alccolica");
        }

        boolean c = true;
        if (c = false){ //Aqui, 'c' passa a valer 'false'
            System.out.println("Esse tipo de coisa não deve ser feito");
        }

        boolean d = false;
        if (d = true){ //Aqui, 'd' passa a ser 'true'
            System.out.println("Este tipo de coisa também não deve ser feito");
        }


    }
}
