package Package;

public class OperadorTernario {
    public static void main(String[] args){
        var resultado = (1>2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        var numero =8;
        resultado =(numero % 2== 0) ? "par" : "Impar";
        System.out.println("numero = " + resultado);
    }
}
