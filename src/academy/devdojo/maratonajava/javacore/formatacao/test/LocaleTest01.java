package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeSwitzerland_It = new Locale("it","CH");
        Locale localeSwitzerland_Fr = new Locale("fr","CH");
        Locale localeFrance = new Locale("fr","FR");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapan = new Locale("ja","JP");
        Locale localeNetherlands = new Locale("nl","NL");
        Locale localeBrazil = new Locale("pt","BR");

        Calendar calendar = Calendar.getInstance();
        Date data = new Date();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland_It);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland_Fr);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);
        DateFormat df8 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println("Data na Itália:     " + df1.format(calendar.getTime()));
        System.out.println("Data na Suíca (IT): " + df2.format(calendar.getTime()));
        System.out.println("Data na Suíça (FR): " + df3.format(calendar.getTime()));
        System.out.println("Data na França:     " + df4.format(calendar.getTime()));
        System.out.println("Data na Índia:      " + df5.format(data));
        System.out.println("Data no Japão:      " + df6.format(data));
        System.out.println("Data na Holanda:    " + df7.format(data));
        System.out.println("Data no Brasil:     " + df8.format(data));
        System.out.println("------------------------------------------------------");
        System.out.println(localeItaly.getDisplayCountry(localeNetherlands)); //Retorno no Locale usado como parâmetro
        System.out.println(localeSwitzerland_It.getDisplayCountry()); //Retorno no Locale padrão da JVM
        System.out.println(localeSwitzerland_Fr.getDisplayCountry(localeJapan));
        System.out.println(localeFrance.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry(localeItaly));
        System.out.println(localeJapan.getDisplayCountry());
        System.out.println(localeNetherlands.getDisplayCountry(localeIndia));
        System.out.println(localeBrazil.getDisplayCountry());
    }
}
