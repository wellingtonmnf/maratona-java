package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        //Instanciando uma LocalDateTime com todos os parâmetros específicos
        LocalDateTime dateTime = LocalDateTime.of(2027, Month.MAY,25,19,14,27,5872);
        System.out.println(dateTime);
        System.out.println();
        //Instanciando uma LocalDateTime com a hora atual padrão do sistema
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);
        System.out.println();
        //Definindo uma LocalDate e uma LocalTime e passando como parâmetro para criar uma LocalDateTime
        LocalDate date = LocalDate.of(2022,Month.SEPTEMBER,6);
        LocalTime time = LocalTime.of(8,42,31);
        LocalDateTime newDateTime = LocalDateTime.of(date,time);
        System.out.println(newDateTime);
        System.out.println();
        //Parseando valores para uma LocalDate e uma LocalTime e passando como parâmetro para criar uma LocalDateTime
        LocalDate newDate = LocalDate.parse("2025-09-23");
        LocalTime newTime = LocalTime.parse("17:15:23");
        LocalDateTime localDateTime = LocalDateTime.of(newDate,newTime);
        System.out.println(localDateTime);
        System.out.println();
        //Associando uma LocalDate a uma LocalTime (e vice-versa) e atribuindo a uma LocalDateTime
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime ldt1 = data.atTime(hora);
        LocalDateTime ldt2 = hora.atDate(data);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}