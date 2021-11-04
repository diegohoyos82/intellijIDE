package Package;

public class OperadoresAritmeticos {
    public static void main (String[] args){
        int a=5, b=2;
        var resultado = a + b;
        System.out.println("El Resultado de la suma es: " + resultado);

        resultado = a - b;
        System.out.println("El Resultado de la resta es: " + resultado);

        resultado = a * b;
        System.out.println("El Resultado de la multiplicacion es: " + resultado);

        var resultado2 = 5D / b;
        System.out.println("El Resultado de la division es: " + resultado2);

        resultado = a % b;
        System.out.println("El Resultado del modulo es: " + resultado);

        if (a % 2  == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
    }
}
