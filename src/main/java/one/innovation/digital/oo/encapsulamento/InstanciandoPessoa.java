package one.innovation.digital.oo.encapsulamento;

public class InstanciandoPessoa {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Thiago", 15, 12, 2001);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calcularIdade());

        eu.setNome("Thiago Dias");

        System.out.println(eu.getNome());

    }

}
