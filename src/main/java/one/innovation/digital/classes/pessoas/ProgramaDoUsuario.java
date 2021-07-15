package one.innovation.digital.classes.pessoas;

import one.innovation.digital.classes.usuarios.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args){
        final var superman = new SuperUsuario("batman", "4345");

        superman.getLogin(); //I can acess the method 'getLogin()' cuz's it's the public access modifier

        //var password = superman.getPassword(); //I CAN'T acess the 'getPassword()' method 'cause it's with the protected access modifier, meaning only classes of the SAME PACKAGE or by heritage can acess

        //String nameOfClient = superman.name; //Can't acess param 'name' cuz the modifer acess's default, so only classes of the same package can acess
    }
}
