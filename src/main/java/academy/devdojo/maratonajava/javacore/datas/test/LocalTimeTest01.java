package academy.devdojo.maratonajava.javacore.datas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.of(23,15,37);
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);
    }
}