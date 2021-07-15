package one.innovation.digital.operators;

public class Logic {
    public static void main(String[] args){
        final var letter = "A";
        final var number = 3;

        //Logics -> || &&
        //Sort circuit -> If the 1st condition's false, it doesn't check de second
        if(number < 5 && letter.equals("A")){
            System.out.println("Condition accepted");
        } else if (number < 3 || letter.equals("B")){
            System.out.println("Other condition accepted");
        }

        //Non-sort circuit -> It checks all conditions
        if(letter.equals("A") | number > 10){
            System.out.println("OK");
        } else {
            System.out.println("Not ok");
        }



    }
}
