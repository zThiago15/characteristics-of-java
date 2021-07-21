package one.innovation.digital.date.javaDate;

import java.util.Date;

public class Exemplo01 {

    public static void main(String[] args) {

        Date data = new Date(); //retorna o tempo atual em milisegundos
        System.out.println(data);

        long milisegundos = System.currentTimeMillis();
        System.out.println(milisegundos);


        Date data_formatada = new Date(milisegundos);
        System.out.println(data_formatada);
    }

}
