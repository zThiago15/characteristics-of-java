package one.innovation.digital.operators;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Equality {

    public static void main(String[] args){

        final var number = 11;

        //Equal -> ==
        if(number == 10){
            System.out.println("The number's 10");
        } else {
            System.out.println("The number's not 10");
        }

        //Different -> !=
        if(number != 10){
            System.out.println("The number's not 10");
        } else {
            System.out.println("The number's 10");
        }

        final var letter = "B";

        //Method equal -> boolean: true/false
        if("A".equals(letter)){
            System.out.println("The letter's A");
        } else if(!letter.equals("A")) {
            System.out.println("The letter's not A");
        }

    }

}
