package one.innovation.digital.cursoemvideo;

import javax.tools.Tool;
import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {

        //Programa que verifica o horário, idioma, país e resolução de tela do sistema

        //Data
        Date relogio = new Date();

        System.out.println("A data atual é: "+ relogio.toString());
        System.out.println();

        //Língua
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma atual do sistema é "+ idioma.getDisplayLanguage() + " do(a) "+ idioma.getDisplayCountry());
        System.out.println();

        //Resolução da tela
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize(); //Recuperando largura e altura

        var largura = resolucao.getWidth();
        var altura = resolucao.getHeight();

        System.out.println("A resolução atual do sistema é "+ largura + " x "+ altura);

    }


}
