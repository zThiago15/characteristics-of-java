package one.innovation.digital.oo.exemplo1;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //Criando um novo objeto da classe Pessoa/Instanciando um objeto

        System.out.println(pessoa.getNome()); //Acessando um método dessa classe
        System.out.println(pessoa.falarMeuProprioNome());

        pessoa.setNome("Renato");

        System.out.println(pessoa.getNome());
    }
}
