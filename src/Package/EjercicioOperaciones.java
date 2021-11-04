package Package;

import java.util.Scanner;

public class EjercicioOperaciones {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese Alto del Rectangulo:");
        var alto = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese ancho del Rectangulo:");
        var ancho = Integer.parseInt(consola.nextLine());

        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;

        System.out.println("Area: " + area);
        System.out.println("Perimtreo: " + perimetro);
    }
}
