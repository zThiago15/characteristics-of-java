package one.innovation.digital.oo.conversaotemperatura;

public class InstanciandoTemperatura {

    public static void main(String[] args) {

        //Programa que converte temperatura Celsius(C°) para Kelvin(K), Réaumur(Re), Rankine(Ra) e Fahrenheit(F)

        ConversaoTemperatura temperatura = new ConversaoTemperatura(43.3);

        System.out.println(temperatura.getTempCelsius()); //Tempetarura C° passada

        System.out.println(temperatura.getTempKelvil());


    }

}
