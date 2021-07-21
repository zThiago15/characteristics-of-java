package one.innovation.digital.date.javaCalendar;

import java.util.Calendar;

public class Exemplo2 {

    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        System.out.println(now);

        System.out.printf("%tc\n", now);
        //ter jul 20 16:15:29 BRT 2021

        System.out.printf("%tF\n", now);
        //2021-07-2021

        System.out.printf("%tD", now);
        //07/20/21 04:15:29 PM

        System.out.printf("%tr\n", now);
        //

        System.out.printf("%tT\n", now);

    }
}
