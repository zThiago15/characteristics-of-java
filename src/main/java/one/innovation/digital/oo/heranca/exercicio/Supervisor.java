package one.innovation.digital.oo.heranca.exercicio;

public class Supervisor extends Funcionario{

    public Double calcularImposto(){
        return this.getSalario()*0.05;
    }

}
