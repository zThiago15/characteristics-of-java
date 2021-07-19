package one.innovation.digital.oo.encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private LocalDate dataNascimento;
    private String nome;


    public Pessoa(String nome, Integer dia, Integer mes, Integer ano){
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public int calcularIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
