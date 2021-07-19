package one.innovation.digital.oo.caracteristicas.exemploequals.semSobrescreverEquals;

public class Carro extends Veiculo {

        private int quantidadePortas;

        public Carro(String marca, String modelo, double valorVenal){
            super(marca, modelo, valorVenal);
        }

        public Carro(String marca, String modelo, double valorVenal, int quantidadePortas){
            super(marca, modelo, valorVenal);
            this.quantidadePortas = quantidadePortas;
        }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public double calcularImposto(){
            return  this.getValorVenal() * 0.07;
    }

}
