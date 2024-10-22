package academy.devdojo.maratonajava.javacore.generics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veículo dispónível...");
        T veiculo = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veículo: " + veiculo);
        System.out.println("Veículos disponíveis para alugar:");
        System.out.println(veiculosDisponiveis);
        return veiculo;
    }

    public void retornarVeiculoAlugado(T veiculo) {
        System.out.println("Devolvendo veículo: " + veiculo);
        veiculosDisponiveis.add(veiculo);
        System.out.println("Veículos disponíveis para alugar:");
        System.out.println(veiculosDisponiveis);
    }
}
