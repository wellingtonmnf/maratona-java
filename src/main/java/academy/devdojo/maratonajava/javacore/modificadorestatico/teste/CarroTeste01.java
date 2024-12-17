package academy.devdojo.maratonajava.javacore.modificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.modificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
//        Carro c1 = new Carro("BMW",280);
//        Carro c2 = new Carro("Mercedes",275);
//        Carro c3 = new Carro("Audi",290);

        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());

//        c1.imprime();
//        c2.imprime();
//        c3.imprime();
    }
}
