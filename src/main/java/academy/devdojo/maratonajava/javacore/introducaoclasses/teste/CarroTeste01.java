package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "HB20";
        carro01.modelo = "Heat";
        carro01.ano = 2023;

        carro02.nome = "Polo";
        carro02.modelo = "Sedan";
        carro02.ano = 2022;

        carro01 = carro02;

        System.out.println("Nome: "+carro01.nome+" Modelo: "+carro01.modelo+" Ano: "+carro01.ano);
        System.out.println("Nome: "+carro02.nome+" Modelo: "+carro02.modelo+" Ano: "+carro02.ano);
    }
}
