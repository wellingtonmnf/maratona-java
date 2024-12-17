package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Carro carro = rentalServiceCarro.buscarVeiculoDisponivel();
        System.out.println("----------------------------");
        System.out.println("Usando o carro por um mês...");
        System.out.println("----------------------------");
        rentalServiceCarro.retornarVeiculoAlugado(carro);
        System.out.println("----------------------------");
        Barco barco = rentalServiceBarco.buscarVeiculoDisponivel();
        System.out.println("----------------------------");
        System.out.println("Usando o barco por um mês...");
        System.out.println("----------------------------");
        rentalServiceBarco.retornarVeiculoAlugado(barco);

    }
}
