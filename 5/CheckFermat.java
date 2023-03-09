import java.lang.Math;

public class CheckFermat {
    public static void main(String[] args) {
        checkFermat(2.0, 3.0, 4.0, 3.0);
    }

    public static void checkFermat(double a, double b, double c, double n) {
        double add = Math.pow(a, n) + Math.pow(b, n);
        double check = Math.pow(c, n);
        if (n > 2 && add == check) {
            log("Kurka wodna, Fermat się mylił!");
        } else {
            log("To nie działa.");
        }
    }

    private final static void log(Object o) {
        System.out.println(o);
    }
}
