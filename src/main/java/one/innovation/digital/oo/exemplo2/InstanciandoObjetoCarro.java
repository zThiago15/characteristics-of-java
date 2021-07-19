package one.innovation.digital.oo.exemplo2;

public class InstanciandoObjetoCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.getQuantidade_pessoa());
        System.out.println(carro.getQuantidade_porta());

        System.out.println(carro.adicionarPessoa());
        System.out.println(carro.removerPessoa());
    }
}
