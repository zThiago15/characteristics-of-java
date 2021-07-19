package one.innovation.digital.oo.caracteristicas.exemplosuper;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal); //super - está referenciando atributos ou métodos da classe principal
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadePortas){
        super(modelo, marca, valorVenal);
        this.quantidadePortas = quantidadePortas;
    }

    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public double calcularImposto(){
        return this.getValorVenal() * 0.07;
    }

}
