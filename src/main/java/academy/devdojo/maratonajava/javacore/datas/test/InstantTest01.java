package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); //Zulu Time
        System.out.println(LocalDateTime.now()); //Hora padrão do sistema
        System.out.println(now.getEpochSecond()); //Conta os nanossegundos a partir de 1970
        System.out.println(now.getNano()); // Retorna os nanossegundos (Max: 999.999.999 nanossegundos)
        System.out.println(Instant.ofEpochSecond(3)); // Retorna 3 segundos a partir de 1970
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000)); // Aumenta 1 segundo a partir dos 3s de 1970
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000)); // Diminui 1 segundo a partirdos 3s de 1970
    }
}