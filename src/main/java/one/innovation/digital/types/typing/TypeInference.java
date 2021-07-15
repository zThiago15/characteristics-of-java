package one.innovation.digital.types.typing;

public class TypeInference {
    public static void main(String[] args){

        // Type Inference - add to Java at version 10
        // var - creates a variable without telling its type, the compiler will know the type based on the value
        var i1 = Integer.valueOf(15);

        var text = "The number's: ";

        System.out.println(text + i1);

    }
}
