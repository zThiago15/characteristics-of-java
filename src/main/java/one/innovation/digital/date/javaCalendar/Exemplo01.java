package one.innovation.digital.date.javaCalendar;

import java.util.Calendar;

public class Exemplo01 {

    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        //Currently data
        System.out.println(now.getTime());

        now.add(Calendar.DATE, -15);
        System.out.println("15 days ago: "+now.getTime());

        now.add(Calendar.MONTH, 4);
        System.out.println("4 months later: "+now.getTime());

        now.add(Calendar.YEAR, 2);
        System.out.println("2 years later: "+now.getTime());



    }
}
