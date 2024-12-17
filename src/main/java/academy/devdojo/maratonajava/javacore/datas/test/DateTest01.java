package academy.devdojo.maratonajava.javacore.datas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data = new Date(); //Retorna a data e hora atuais
        System.out.println(data);
        Date data2 = new Date();
        System.out.println(data2.getTime()); //Retorna o tempo em milissegundos
        Date data3 = new Date(1723639901736L); //Tempo inserido em milisegundos
        System.out.println(data3); //Retorna a data e hora inserida em milissegundos
        System.out.println(data3.getTime() + 3_600_000); //Retorna a data e hora atuais acrescida de 1 hora em milissegundos
        Date data4 = new Date(data3.getTime() + 3_600_000); //Retorna a data e hora atuais acrescida de 1 hora em milissegundos
        System.out.println(data4);
    }
}
