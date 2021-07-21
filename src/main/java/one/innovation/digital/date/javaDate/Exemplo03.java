package one.innovation.digital.date.javaDate;

import java.util.Date;

public class Exemplo03 {
    public static void main(String[] args) {

        //Declarando variáveis
        Date dataPassado = new Date(1626793967083L);

        Date dataFuturo = new Date(1626794606723L);

        Date mesmaDataFuturo = new Date(1626794606723L);

        //Verificar se 2 datas são iguais
        boolean equals = dataFuturo.equals(mesmaDataFuturo);
        System.out.println(equals);

        //Comparar datas
        int compareCase1 = dataPassado.compareTo(dataFuturo); //passado -> futuro
        int compareCase2 = dataFuturo.compareTo(dataPassado); //futuro -> passado
        int compareCase3 = dataFuturo.compareTo(mesmaDataFuturo); //datas iguais

        System.out.println(compareCase1); //-1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0

        //gerar data atual



    }
}
