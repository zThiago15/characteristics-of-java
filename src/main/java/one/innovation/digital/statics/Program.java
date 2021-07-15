package one.innovation.digital.statics;

public class Program {

    public static void main(String[] args){
        final Dog pitbull = new Dog();
        pitbull.zoologia = "Bípede";

        final Dog viralata = new Dog();

        System.out.println(pitbull.zoologia);
        System.out.println(viralata.zoologia);

        Dog.late();

    }
}
