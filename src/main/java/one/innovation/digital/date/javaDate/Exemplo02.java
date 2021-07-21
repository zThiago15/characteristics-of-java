package one.innovation.digital.date.javaDate;

import java.util.Date;

public class Exemplo02 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1626793553945L);

        Date dataNoFuturo = new Date(1626793967083L);

        boolean isAfter = dataNoFuturo.after(dataNoPassado);
        System.out.println(isAfter);

    }

}
