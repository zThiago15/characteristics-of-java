package one.innovation.digital.oo.heranca.exemplo02;

public class Veiculo {

    private String marca;
    private String modelo;
    private Double valorVenal;

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double calcularImposto(){
        return this.valorVenal * 0.01;
    }

}
