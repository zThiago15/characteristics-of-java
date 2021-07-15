package one.innovation.digital.types.typing;

public class StrongTyping {

    public static void main(String[] args){
        //You can change the type of a variable after initialized
        String text;
        //text = 432; //Error


        Integer numero = Integer.valueOf("643");
        numero = 43; //OK - you just changed the value, not the type
    }

}
