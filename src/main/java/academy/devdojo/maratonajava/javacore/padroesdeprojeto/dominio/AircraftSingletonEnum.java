package academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;

    private final Set<String> avaliableSeats;

    AircraftSingletonEnum() {
        this.avaliableSeats = new HashSet<>();
        this.avaliableSeats.add("1A");
        this.avaliableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaliableSeats.remove(seat);
    }
}
