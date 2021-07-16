package one.innovation.digital.loops;

public class While {
    public static void main(String[] args){

        var y = 20;

        while(0 < y){
            System.out.println(y);
            y--;
        }

        var x = 10;
        int number = 1;

        do{
            System.out.println(x + " x " + number + " = " + (x*number));
            number++;

        } while(number <= 10);
    }
}
