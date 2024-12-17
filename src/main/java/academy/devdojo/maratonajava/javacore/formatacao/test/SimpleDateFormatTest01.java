package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Salvador |' EEEE',' dd 'de' MMMM 'de' yyyy '-' z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Salvador | quinta-feira, 15 de agosto de 2024 - BRT"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
