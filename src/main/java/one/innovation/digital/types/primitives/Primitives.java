package one.innovation.digital.types.primitives;

public class Primitives {
    public static void main(String[] args) {

        //We can't have null values
        //byte nullByte = null; //Error

        byte b;        //8 bits
        byte b1 = 127; //Maximun value
        byte b2 = -128; //Minimun value
        //byte b3 = 130; //Too large

        char c; //16 bits
        char c1 = 35;   //Alphanumeric - accepts numbers and a letter
        char c2 = 's';

        short s; //16 bits
        short s1 = 32767; //Maximun value
        short s2 = -32768; //Minimun value


        int i; //32 bits
        int i2 = 4535353;
        int i3 = -455453435;

        long l;   //64 bits
        long l1 = 9223372036854775807L;
        long l2 = -9223372036854775808L;

        float f; //32 bits
        float f1 = 87.5f;
        float f2 = -4324.4f;

        double d;   //64 bits
        double d1 = 1029.4;

        boolean bo;
        boolean bo1 = true;
        boolean bo2 = false;


        //void v; //retorno de um método
    }
}

