package one.innovation.digital.javaDate;

import java.util.Date;

public class Exercicio {

    public static void main(String[] args) {

        /*
        * Descubra o tempo em milisegundos do seu nascimento(site)
        *  Converta para um objeto Date;
        *  Verifique se é anterior ou posterior a 15 de maio de 2010
        * */

        Date dataNascimento = new Date(1008388800000L);
        System.out.println(dataNascimento);

        Date dataFutura = new Date(1273896000000L);
        System.out.println(dataFutura);

        System.out.println(dataNascimento.after(dataFutura)); //false
        System.out.println(dataNascimento.before(dataFutura)); //true

    }
}
