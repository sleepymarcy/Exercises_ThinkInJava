import java.util.Scanner;

public class Triangle {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        logg("Proszę podać dodatnie wartości dla długości boków trójkąta: ");
        log("a: ");
        int a = scanner.nextInt();
        log("b: ");
        int b = scanner.nextInt();
        log("c: ");
        int c = scanner.nextInt();

        log(check(a, b, c));

    }

    public static String check(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            log("Błędne dane.");
        } else {
            if (a + b > c && b + c > a && a + c > b) {
                log("Z odcinków o podanych długościach da się utworzyć trójkąt.");
            } else {
                log("Z odcinków o podanych długościach nie da się utworzyć trójkąta.");
            }
        }
        return "";
    }

    private final static void log(Object o) {
        System.out.print(o);
    }

    private final static void logg(Object o) {
        System.out.println(o);
    }
}
