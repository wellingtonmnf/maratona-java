package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.DECEMBER);
        System.out.println(Month.DECEMBER.getValue());
        LocalDate data = LocalDate.of(1989,Month.DECEMBER,20);
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getMonthValue());
        System.out.println(data.getDayOfWeek());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfYear());
        System.out.println(data.lengthOfMonth());
        System.out.println(data.lengthOfYear());
        System.out.println(data.isLeapYear());
        System.out.println(data.get(ChronoField.YEAR));
        System.out.println(data.get(ChronoField.DAY_OF_MONTH));
        System.out.println(data);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        LocalDate agora = LocalDate.now(); //Instância com a data atual
        System.out.println(agora); //Mostra a data atual
        agora.plusDays(5); //Cria novo objeto com novo valor de data
        System.out.println(agora); //Mostra a data atual (objeto é imutável)
        agora = agora.plusDays(5); //Atribui novo valor de data ao objeto
        System.out.println(agora); //Mostra objeto com nova data referenciada
    }
}