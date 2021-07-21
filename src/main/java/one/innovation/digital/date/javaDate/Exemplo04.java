package one.innovation.digital.date.javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo04 {

    public static void main(String[] args) {

        Date data = new Date();
        System.out.println(data);

        Instant instant = data.toInstant();
        System.out.println(instant);
    }
}
