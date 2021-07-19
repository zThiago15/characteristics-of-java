package one.innovation.digital.oo.heranca.exemplo02;

public class Carro extends Veiculo{

    private Integer quantidade_portas;

    public Integer getQuantidade_portas() {
        return quantidade_portas;
    }

    public void setQuantidade_portas(Integer quantidade_portas) {
        this.quantidade_portas = quantidade_portas;
    }

    public Double calcularImposto(){
        return this.getValorVenal() * 0.07;
    }

}
