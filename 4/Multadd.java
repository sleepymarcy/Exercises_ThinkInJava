import java.lang.Math;

public class Multadd {
    public static void main(String[] args) {
        
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(0.5, Math.cos(Math.PI/4), Math.sin(Math.PI/4)));
        multadd(0.5, Math.cos(Math.PI/4), Math.sin(Math.PI/4));
        System.out.println(multadd(2, Math.log(10), Math.log(2)));
    }

    public static double multadd(double a, double b, double c) {
        return  a * b + c;
    }
}