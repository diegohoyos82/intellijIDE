package Package;

import java.util.Scanner;

public class TituloLibro {
    public static void main(String[] args){
        System.out.println("Ingrese el Nombre del Libro");
        Scanner consola = new Scanner(System.in);
        var titulo =consola.nextLine();
        System.out.println("Ingrese el Nombre del Autor");
        var autor = consola.nextLine();
        System.out.println("El Libro " +  titulo + " Fue escrito por " + autor);
    }
}
