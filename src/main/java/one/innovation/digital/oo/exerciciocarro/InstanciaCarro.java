package one.innovation.digital.oo.exerciciocarro;

public class InstanciaCarro {

    public static void main(String[] args) {

        Carro marca = new Carro("Ford", "KA", 2007);

        System.out.println("Marca: "+ marca.getMarca());
        System.out.println("Modelo: "+ marca.getModelo());
        System.out.println("Ano: "+ marca.getAno());

    }
}
