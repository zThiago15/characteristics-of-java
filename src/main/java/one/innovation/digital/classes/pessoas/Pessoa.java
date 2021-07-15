package one.innovation.digital.classes.pessoas;

public class Pessoa {

    //Pessoa tem q ter nome, idade e RG
    //Params
    private Integer age;
    private Float weight;

    //Private(only for params) - Just its class can access

    public Pessoa(){
    }

    public Pessoa(final Integer age){
        this.age = age; //The age passing by the argument, will be STORED inside of the variable 'age' declared upthere
    }

    public Pessoa(final Float weight){
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public Float getWeight() {
        return weight;
    }

}
