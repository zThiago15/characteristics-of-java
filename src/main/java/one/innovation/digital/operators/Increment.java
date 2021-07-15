package one.innovation.digital.operators;

public class Increment {
    public static void main(String[] args){
        var number = 1;

        //Incrementing/decrementing and showing
        System.out.println(++number);
        System.out.println(--number);

        //Showing and incrementing/decrementing
        System.out.println(number++);
        System.out.println(number--);

        System.out.println(number);
    }
}
