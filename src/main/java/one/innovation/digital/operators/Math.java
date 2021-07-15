package one.innovation.digital.operators;

public class Math {

    public static void main(String[] args){
        var number = 10;

        System.out.println("Operators with the numbers 10 and 5");
        System.out.println("Addition(+): "+ (10 + 5));
        System.out.println("Subtraction(-): "+ (10 - 5));
        System.out.println("Multiplication(*): "+ (10 * 5));
        System.out.println("Division(/): "+ (10 / 5));
        System.out.println("Module(%): "+ (10%5));

        number *= 2; //Equal to: number = number * 2;
        System.out.println(number);
    }
}
