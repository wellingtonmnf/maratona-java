package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("----------------------------");
        System.out.println("Usando o carro por um mês...");
        System.out.println("----------------------------");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
