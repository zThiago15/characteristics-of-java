package one.innovation.digital.oo.conversaotemperatura;

public class ConversaoTemperatura {

    private Double tempCelsius;
    private Double tempKelvil;

    public ConversaoTemperatura(Double tempCelsius){
        this.tempCelsius = tempCelsius;
    }

    public Double getTempCelsius() {
        return tempCelsius;
    }

    public Double getTempKelvil() {
        return tempKelvil = tempCelsius + 273.15;
    }
}
