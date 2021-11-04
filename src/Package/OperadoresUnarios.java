package Package;

public class OperadoresUnarios {
    public static void main(String[] args){
        var a=3;
        var b= -a;
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);

        var c= true;
        var d=!c;
        System.out.println("c es: " + c);
        System.out.println("d es: " + d);

        var e =3;
        var f = ++e;
        System.out.println("e es:" + e);
        System.out.println("f es:" + f);

        var g =5;
        var h = g++;
        System.out.println("g es:" + g);
        System.out.println("h es:" + h);

        var i =2;
        var j = --i;
        System.out.println("i es:" + i);
        System.out.println("j es:" + j);

        var k =4;
        var l = k--;
        System.out.println("k es:" + k);
        System.out.println("l es:" + l);
    }
}
