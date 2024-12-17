package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeBrazil = new Locale("pt","BR");
        Locale localeArgentina = new Locale("es","AR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localeBrazil);
        nfa[1] = NumberFormat.getInstance(localeArgentina);
        nfa[2] = NumberFormat.getInstance(localeJapan);
        nfa[3] = NumberFormat.getInstance(localeItaly);

        double valor = 10_150_578.53589;

        for (NumberFormat numberFormat : nfa){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "15.597,62";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
