package academy.devdojo.maratonajava.javacore.modificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.modificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        //carro.COMPRADOR = new Comprador(); ERRO!


    }
}
