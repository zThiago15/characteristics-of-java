package one.innovation.digital.oo.heranca.exemplo01;

public class Veiculo {

    private String marca;
    private String modelo;

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

    public String acelera(){
        return "Acelerando..";
    }

}
