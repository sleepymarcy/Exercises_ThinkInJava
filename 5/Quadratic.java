import java.util.Scanner;

public class Quadratic {

    static final Scanner scanner = new Scanner(System.in);
    static final String info = "To nie liczba.";

    public static void main(String[] args) {
        logg("Podaj wartości całkowite dla: ");

        int a, b, c;

        log("a: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            return;
        }
        a = scanner.nextInt();

        log("b: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            return;
        }
        b = scanner.nextInt();

        log("c: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            return;
        }
        c = scanner.nextInt();

        log(miejsca(a, b, c));

    }

    static String miejsca(int a, int b, int c) {
        double b2 = Math.pow(b, 2.0);
        double delta = b2 - (4 * a * c);

        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        double x2 = (-b + Math.sqrt(delta)) / 2 * a;

        if (delta > 0) {
            // return x1 + ", " + x2;
            return String.format("x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (delta == 0) {
            return String.format("x = %.2f", x1);
        } else {
            return "brak";
        }
    }

    private static final void log(Object o) {
        System.out.print(o);
    }

    private static final void logg(Object o) {
        System.out.println(o);
    }

    // static double[] pierwiastki(double a, double b, double c) {
    // double[] pierwiastki = new double[2];
    // double b2 = Math.pow(b, 2.0);
    // double sqrtDelta = Math.sqrt(b2 - 4.0 * a * c);
    // pierwiastki[0] = (-b + sqrtDelta) / (2.0 * a);
    // pierwiastki[1] = (-b - sqrtDelta) / (2.0 * a);
    // return pierwiastki;
    // }

    // private static final void takMainNie() {
    // double a = 0, b = 0, c = 0;

    // if (scanner.hasNextDouble()) {
    // a = scanner.nextDouble();
    // log("b: ");
    // if (scanner.hasNextDouble()) {
    // b = scanner.nextDouble();
    // log("c: ");
    // if (scanner.hasNextDouble()) {
    // c = scanner.nextDouble();
    // log(miejsca(a, b, c));
    // } else {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // }
    // } else {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // }
    // } else {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // }

    // // tak też nie:

    // log("a: ");
    // if (!scanner.hasNextDouble()) {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // } else {
    // a = scanner.nextDouble();
    // log("b: ");
    // if (!scanner.hasNextDouble()) {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // } else {
    // b = scanner.nextDouble();
    // log("c: ");
    // if (!scanner.hasNextDouble()) {
    // String word = scanner.next();
    // System.err.println(word + " nie jest liczbą");
    // } else {
    // c = scanner.nextDouble();
    // log(miejsca(a, b, c));
    // }
    // }
    // }
    // }
}
