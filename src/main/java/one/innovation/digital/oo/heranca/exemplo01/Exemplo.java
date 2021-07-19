package one.innovation.digital.oo.heranca.exemplo01;

public class Exemplo {

    public static void main(String[] args) {

     Carro carro = new Carro();
     carro.setMarca("Nissan");
     carro.setModelo("March");
     carro.setQuantidade_portas(4);


     Motocicleta moto = new Motocicleta();
     moto.setMarca("Ducati");
     moto.setModelo("Streetfighter");
     moto.setCilindrada("850");


        System.out.println(carro.acelera());

    }
}
