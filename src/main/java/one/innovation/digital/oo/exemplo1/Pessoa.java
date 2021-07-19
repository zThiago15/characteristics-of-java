package one.innovation.digital.oo.exemplo1;

public class Pessoa {

    String nome = "Thiago";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String falarMeuProprioNome(){
        return "Olá, meu nome é "+nome;
    }

}
