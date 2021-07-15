package one.innovation.digital.conditionals;

public class IF {
    public static void main(String[] args){
        final var condition = true;

        if(condition){ //If the value of the variable's true
            System.out.println("The condition is true");
        } else {
            System.out.println("The condition's false");
        }

        //ternary
        final var ternary = condition ? true : "If not, this'll be";
        System.out.println(ternary);
        System.out.println();

        //Verifying if someone's underage or grow-up
        final var age = 18;

        if(age < 18){
            System.out.println("You're underage");
        } else {
            System.out.println("You're a grow-up");
        }
    }
}
