package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeBrazil = new Locale("pt","BR");
        Locale localeArgentina = new Locale("es","AR");
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeBrazil);
        nfa[1] = NumberFormat.getCurrencyInstance(localeArgentina);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[3] = NumberFormat.getCurrencyInstance(localeItaly);

        double valor = 10_150_578.53589;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println("Tipo de moeda: " + numberFormat.getCurrency() + " " + numberFormat.format(valor));
        }

        String valorString = "R$ 8.248,78";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}