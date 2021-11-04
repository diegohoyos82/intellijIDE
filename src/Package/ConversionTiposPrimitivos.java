package Package;

import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main (String[] args){

        var edad= Integer.parseInt("20");
        System.out.println(edad);
        System.out.println(edad + 1);

        var valorPi = Double.parseDouble("3.1416");
        System.out.println(valorPi);

        var consola =new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt( consola.nextLine() );
        System.out.println("Su edad es:" + edad);

        var edadTexto =String.valueOf(10);
        System.out.println("EdadTexto: " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter:" + caracter);

        System.out.println("proporcione un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Caracter: " + caracter);
    }
}