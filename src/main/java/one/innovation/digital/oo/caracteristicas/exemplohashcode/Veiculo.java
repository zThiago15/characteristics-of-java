package one.innovation.digital.oo.caracteristicas.exemplohashcode;

import java.util.Objects;

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

    //Gerar um código hash para cada atributo
    @Override
    public int hashCode(){
        return Objects.hash(modelo, marca, valorVenal);
    }

    //Comparar se os valores do usuário é igual a outro
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

        if (this.hashCode() == obj.hashCode()){
            return true;
        }

        return false;
    }
}
