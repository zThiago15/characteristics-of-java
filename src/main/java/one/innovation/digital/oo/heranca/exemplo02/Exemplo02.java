package one.innovation.digital.oo.heranca.exemplo02;

public class Exemplo02 {

    public static void main(String[] args) {

     Veiculo generico = new Veiculo();
     generico.setValorVenal(1000D);
     System.out.println(generico.calcularImposto()); //10

     Veiculo carro = new Carro();
     carro.setValorVenal(1000D);
     System.out.println(carro.calcularImposto()); //70

     Veiculo moto = new Motocicleta();
     moto.setValorVenal(1000D);
     System.out.println(moto.calcularImposto()); //30

    }
}
