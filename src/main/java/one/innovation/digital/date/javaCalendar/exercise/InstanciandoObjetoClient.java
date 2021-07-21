package one.innovation.digital.date.javaCalendar.exercise;

import java.util.Calendar;
import java.util.Date;

public class InstanciandoObjetoClient {

    public static void main(String[] args) {

        /*
            Um cliente tem 10 dias para pagar uma fatura após sua data
        de vencimento sem que juros sejam cobrados.
            Caso essa data caia em um sábado ou domingo, o cliente pode pagar
        na segunda-feira seguinte. Crie uma estrutura que receba uma data de vencimento
        e calcule quantos dias ele tem para pagar.


         */



        //Date client = new Client(); //Tue Jul 20 16:40:55 BRT 2021







        //Exemplo
        //Pegar milisegundos da data atual
        Date dataHoje = new Date(1626810969161L);

        //Adicionar + 7 dias a partir de hoje
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DAY_OF_MONTH, 7);

    }

}
