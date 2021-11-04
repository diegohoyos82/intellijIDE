package Package;

import java.util.Scanner;

public class EjecicioCaseCalificaciones {
    public static void main(String[] args){

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese valor entre 0 y 10");
        var valor = Float.parseFloat(consola.nextLine());

        if(valor > 0 && valor < 10){
            if (valor >= 9 && valor <= 10){
                System.out.println("Calificacion = A");
            }
            else if (valor >= 8 && valor < 9){
                System.out.println("Calificacion = B");
            }
            else if (valor >= 7 && valor < 8){
                System.out.println("Calificacion = C");
            }
            else if (valor >= 6 && valor < 7){
                System.out.println("Calificacion = D");
            }
            else if (valor >= 0 && valor < 6){
                System.out.println("Calificacion = E");
            }
        }
        else {
            System.out.println("valor Desconocido");
        }
    }
}
