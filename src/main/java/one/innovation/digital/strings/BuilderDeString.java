package one.innovation.digital.strings;

public class BuilderDeString {
    public static void main(String[] args) {

        var nome = "Thiago";


        //Testing methods
        //Append
        final var builder = new StringBuilder(nome);
        System.out.println(builder.append(" Dias")); //Adicionando 'Dias' na variável 'nome' com o método append

        //Reverse
        final var reverse = builder.reverse();
        System.out.println(reverse);

        //Insert
        final var insert = builder.reverse().insert(0, "R").insert(reverse.length(), "$");
        System.out.println(insert);

        //Exercises
        System.out.println(); //Jumping line
        System.out.println("1 - Insert on 1st and last position the symbol '$'");
        final var wealth_name = new StringBuilder(nome); //Calling a new Class: StringBuilder from package 'java.lang'
        System.out.println(wealth_name.insert(0, "$").insert(wealth_name.length(), "$"));

        System.out.println();
        System.out.println("2 - Add your middle and forename to your variable");
        final var full_name = new StringBuilder(nome);
        System.out.println(full_name.append(" Dias").append(" Barboza"));

        System.out.println();
        System.out.print("3 - Show your full name backwards");
        final var name_backwards = new StringBuilder(nome);
        System.out.println();
        System.out.println(full_name.reverse());
    }
}
