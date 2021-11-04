package Package;

import java.util.Scanner;

public class ClaseScaner {
    public static void  main(String args[]){
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var nombre =consola.nextLine();
        System.out.println("nombre:" + nombre);
        System.out.println("Escribe titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado:" + titulo + " " + nombre);

    }

}
