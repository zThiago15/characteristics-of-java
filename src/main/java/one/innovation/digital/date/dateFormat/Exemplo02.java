package one.innovation.digital.date.dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo02 {

    public static void main(String[] args) {
        Date agora = new Date();
        //Usando SimpleDataFormat


        //Definindo formatado da data
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");

        String dtToStr = formatter.format(agora); //Transformando data em String com esse padrão
        System.out.println(dtToStr); //Exibindo pro usuário

        //Exercício: mostrar data no formato dd/MM/YYYY HH:MM:SS:MMM
        formatter = new SimpleDateFormat("dd/MM/YYYY HH:MM:ss:MMM");
        String dataTotal = formatter.format(agora);
        System.out.println(dataTotal);


    }


}
