package Package;

import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args){

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el Nombre del Libro");
        var libro = consola.nextLine();

        System.out.println("Proporciona el ID del Libro");
        var id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio del Libro");
        var precio = Double.parseDouble(consola.nextLine());

        System.out.println("El nombre del Libro es: " + libro );
        System.out.println("El Id del Libro es: " + id );
        System.out.println("El precio del Libro es: " + precio );

        if (precio >= 5000){
            System.out.println("El Envio Gratuito es: " + true);
        }
        else {
            System.out.println("El Envio Gratuito es: " + false);
        }
    }
}
