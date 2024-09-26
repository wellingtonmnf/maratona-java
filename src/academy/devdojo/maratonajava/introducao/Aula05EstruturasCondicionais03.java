package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar R$ 500 ao DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições de doar, mas terei!";
        String resultado;
        resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
