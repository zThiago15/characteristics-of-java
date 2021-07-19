package one.innovation.digital.oo.exemplo3;

public class Pessoa {

    private String nome;

    public Pessoa(String nome){ //Construtor parametrizado, preciso passar o nome quando instaciar
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
