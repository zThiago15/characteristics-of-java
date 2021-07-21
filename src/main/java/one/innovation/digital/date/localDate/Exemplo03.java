package one.innovation.digital.date.localDate;

import java.time.LocalDateTime;

public class Exemplo03 {

    public static void main(String[] args) {
        //LocalDateTime -> data e tempo, com precisão de nanosegundo
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(5).plusDays(3).plusMonths(2);
        System.out.println(futuro);

        //Exercício: adiciona 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
        LocalDateTime momento = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        LocalDateTime futuroMomento = momento.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuroMomento);

    }
}
