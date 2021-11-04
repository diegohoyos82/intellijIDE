package Package;

import java.util.Scanner;

public class EjercicioMayor {
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese Numero 1: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese Numero 2: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        if (numero1 > numero2){
            System.out.println("El numero Mayor es: " + numero1);
        }
        else{
            System.out.println("El numero Mayor es: " + numero2);
        }

    }

}

