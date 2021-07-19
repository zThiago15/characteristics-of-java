package one.innovation.digital.oo.heranca.exemplo02;

public class Motocicleta extends Veiculo{

    private String cilindrada;

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Double calcularImposto(){
        return this.getValorVenal() * 0.03;
    }

}
