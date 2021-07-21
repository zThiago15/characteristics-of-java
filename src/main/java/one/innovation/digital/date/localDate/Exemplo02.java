package one.innovation.digital.date.localDate;

import java.time.LocalTime;

public class Exemplo02 {

    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        //Somar Hora + 3
        LocalTime horaFutura = horaAtual.plusHours(3);
        System.out.println(horaFutura);
    }
}
