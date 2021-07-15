package one.innovation.digital.classes.usuarios;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new SuperUsuario("root", "1234");
        //I'm instancing(calling) the class 'SuperUsuario' and passing the params of the method SuperUsuario of its class

        superUsuario.getLogin();

        superUsuario.getPassword();

        //I'm can call the param 'name' from the class 'SuperUsuario'
        // cuz the Acess Modifier's default, so all the classes of the same package can acess
        String root = superUsuario.name;
    }
}
