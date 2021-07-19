package one.innovation.digital.oo.caracteristicas.exemploequals.sobrescevendoEquals;

public class Veiculo {

    private String marca;
    private String modelo;

    private double valorVenal;

    public Veiculo(String marca, String modelo, double valorVenal){
        this.marca = marca;
        this.modelo = modelo;
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

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calcularImposto(){
        return this.getValorVenal() * 0.01;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        Veiculo comparavel;
        if (obj instanceof Veiculo){
            comparavel = (Veiculo)obj;
        } else {
            return false;
        }

        if (comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.valorVenal == this.valorVenal){
            return true;
        }

        return false;
    }
}
