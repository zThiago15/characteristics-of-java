package one.innovation.digital.operators;

public class Relationals {
    public static void main(String[] args){
        final var number = 10;

        if(number <= 5){
            System.out.println("The number's equal or less to 20");
        } else if (number > 20){
            System.out.println("The number's bigger than 20");
        } else if (number >= 11){
            System.out.println("The number's equal or bigger to 11");
        } else {
            System.out.println("Number undefinied");
        }
    }
}
