package one.innovation.digital.types.nonprimitives;

public class Unboxing {
    public static void main(String[] args) {

        //Unboxing - you build an object and attributes them to a primitive type
        int i = new Integer(15); //Deprecated
        int i1 = Integer.valueOf(15);

        boolean b = new Boolean(true); //Deprecated
        boolean b1 = Boolean.TRUE; //It's equal to: 'new Boolean(true);'
        boolean b3 = Boolean.getBoolean("true");
    }
}
