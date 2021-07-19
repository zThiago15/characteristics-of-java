package one.innovation.digital.oo.heranca.exercicio;

public class Funcionario {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularImposto(){
        return this.salario * 0.01;
    }

}
