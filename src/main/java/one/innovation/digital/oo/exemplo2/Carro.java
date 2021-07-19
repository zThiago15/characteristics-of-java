package one.innovation.digital.oo.exemplo2;

public class Carro {
    Integer quantidade_pessoa = 2;

    Integer quantidade_porta = 2;

    public Integer getQuantidade_pessoa() {
        return quantidade_pessoa;
    }

    public Integer getQuantidade_porta() {
        return quantidade_porta;
    }

    public String removerPessoa(){
        return "Removendo pessoa..";
    }

    public String adicionarPessoa(){
        return "Adicionando pessoa..";
    }



}
