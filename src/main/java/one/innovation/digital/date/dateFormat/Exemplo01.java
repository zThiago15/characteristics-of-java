package one.innovation.digital.date.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo01 {

    public static void main(String[] args) {
        Date agora = new Date();
        String datToStr = DateFormat.getInstance().format(agora);

        System.out.println(datToStr);

        //Exibindo data em formato longo(Ex: 7 de julho de 2020) e hora curta(Ex: 23:47))
        datToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(datToStr);

        //Exibindo data em formato longo e hora longa(Ex: 23:47:39))
        datToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(datToStr);
    }
}

