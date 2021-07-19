package one.innovation.digital.oo.caracteristicas.exemplohashcode;

public class Exemplo01 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 1000);
        Veiculo carro2 = new Carro("Palio", "Fiat", 1000);


        System.out.println(carro1.equals(carro2)); //true
    }
}
