package one.innovation.digital.oo.heranca.exercicio;

public class Exemplo {

    public static void main(String[] args) {

        Funcionario generico = new Funcionario();
        generico.setSalario(1000D);
        System.out.println(generico.calcularImposto()); //10 -> 1% de imposto no mínimo


        Funcionario gerente = new Gerente();
        gerente.setSalario(1000D);
        System.out.println(gerente.calcularImposto()); //100 -> 10% de imposto do gerente

        Funcionario supervisor = new Supervisor();
        supervisor.setSalario(1000D);
        System.out.println(supervisor.calcularImposto()); //50 -> 5% de imposto do supervisor

        Funcionario atendente = new Atendente();
        atendente.setSalario(1000D);
        System.out.println(atendente.calcularImposto()); //10 -> 1% de imposto do supervisor

    }



}
