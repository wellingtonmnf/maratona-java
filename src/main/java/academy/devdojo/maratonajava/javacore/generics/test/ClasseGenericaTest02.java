package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("----------------------------");
        System.out.println("Usando o barco por um mês...");
        System.out.println("----------------------------");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
