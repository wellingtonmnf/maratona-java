package academy.devdojo.maratonajava.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        if (cal.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("O primeiro dia da semana é Domingo");
        }
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //Retorna o dia da semana pela ordem do calendário
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // Retorna o dia em relação ao mês
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // Retorna o dia em relação ao ano (quantidade de dias passados no ano)
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Retorna o numero da semana em relação as semanas cheias dentro do mês

        cal.add(Calendar.DAY_OF_MONTH,2);
        cal.roll(Calendar.HOUR,13);

        Date data = cal.getTime();
        //System.out.println(cal); //Retorna um objeto de descrição complexa
        System.out.println(data);
    }
}
