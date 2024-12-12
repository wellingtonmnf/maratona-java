package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
//        Aircraft aircraft = new Aircraft("787-900");
//        Sempre geraria um novo objeto, causando inconsistência e erros
//        System.out.println(aircraft.bookSeat(seat));
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
