package one.innovation.digital.oo.heranca.exercicio;

public class Atendente extends Funcionario{

    public Double calcularImposto(){
        return this.getSalario()*0.01;
    }

}
