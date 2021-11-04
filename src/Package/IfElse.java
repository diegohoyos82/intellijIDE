package Package;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese Numero");
        var numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "Valor Desconocido";

        switch (numero){
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "Numero desconocido";

        }
        System.out.println("numeroTexto = " + numeroTexto);


    }
}
