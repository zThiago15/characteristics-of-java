package one.innovation.digital.strings;

import java.util.Locale;

public class Strings {

        public static void main(String[] args){
            var forename = "Thiago";
            var middlename = "Dias";
            var surname = "Barboza";

            //Print your full name (DONE)
            //System.out.println(forename+" "+middlename+" "+surname);


            var nome = "  Thiago  ";
            var sobrenome = "Dias";

            //Testing methods
            System.out.println("Tamanho: "+nome.length());
            System.out.println("Com trim: "+nome.trim());
            System.out.println("Sem trim: "+nome);
            System.out.println("Minúsculo: "+nome.toLowerCase());
            System.out.println("Maiúsculo"+nome.toUpperCase());
            System.out.println("Contém a palavra Dia? "+nome.contains("Dia"));
            System.out.println("Trocando a por @: "+nome.replace("a", "@"));
            System.out.println("Variável 'nome' é igual a Barboza? "+nome.equals("Barboza"));

            System.out.println("Ignora maiúsculo e minúsculo? "+nome.equalsIgnoreCase("ThF fd FD"));
            System.out.println(nome.trim().substring(0,6));
            System.out.println(String.format("Meu nome é %s e sobrenome é %s", nome, sobrenome));
            //Use all the methods learned from class String, that's from the package java.lang

        }

}
