package tij.exercises;

import java.util.Random;
import java.util.Scanner;

public class Chapter5 {
    Chapter5() {
    }

    static Random random;

    public static void isTriangle() {
        Scanner scanner = new Scanner(System.in);

        logg("Proszę podać dodatnie wartości dla długości boków trójkąta: ");
        log("a: ");
        int a = scanner.nextInt();
        log("b: ");
        int b = scanner.nextInt();
        log("c: ");
        int c = scanner.nextInt();

        log(check(a, b, c));

        scanner.close();
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

    public static void singleIf(int n) {
        if (n > 0 && n < 10) {
            System.out.println("Dodatnia liczba jednocyfrowa.");
        }
    }

    public static void quadratic() {
        Scanner scanner = new Scanner(System.in);
        String info = "To nie liczba.";

        log("Podaj wartości całkowite dla: ");

        int a, b, c;

        log("a: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            scanner.close();
            return;
        }
        a = scanner.nextInt();

        log("b: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            scanner.close();
            return;
        }
        b = scanner.nextInt();

        log("c: ");
        if (!scanner.hasNextInt()) {
            logg(info);
            scanner.close();
            return;
        }
        c = scanner.nextInt();

        log(vectors(a, b, c));

        scanner.close();
    }

    static String vectors(int a, int b, int c) {
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

    public static void checkFermat(double a, double b, double c, double n) {
        double add = Math.pow(a, n) + Math.pow(b, n);
        double check = Math.pow(c, n);

        if (n > 2 && add == check) {
            logg("Kurka wodna, Fermat się mylił!");
        } else {
            logg("To nie działa.");
        }
    }

    public static void hoppyFrabjous() {
        boolean flag1 = isHoppy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);

        if (flag1 && flag2) {
            System.out.println("ping!");
        }
        if (flag1 || flag2) {
            System.out.println("pong!");
        }
    }

    public static boolean isHoppy(int x) {
        boolean hoppyFlag;
        if (x % 2 == 0) {
            hoppyFlag = true;
        } else {
            hoppyFlag = false;
        }
        return hoppyFlag;
    }

    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }

    public static void guessNumber() {
        final String wygrales = "Gratulacje, wygrałeś!";
        final String zaDuza = "Liczba jest za duża.";
        final String zaMala = "Liczba jest za mała.";

        Scanner scanner = new Scanner(System.in);
        if (random == null) {
            random = new Random();
        }

        int number = random.nextInt(100) + 1;

        logg("Myślę o liczbie pomiędzy 1 a 100 (z nimi włącznie).");
        logg("Czy zgadniejsz jaka to liczba?");
        logg("Podaj liczbę: ");

        Integer input = scanner.nextInt();
        if (input == number) {
            logg(wygrales);
        } else if (input > number) {
            logg(zaDuza);
        } else {
            logg(zaMala);
        }

        input = scanner.nextInt();
        if (input == number) {
            logg(wygrales);
        } else {
            if (input > number) {
                logg(zaDuza);
            } else {
                logg(zaMala);
            }
        }

        input = scanner.nextInt();
        if (input == number) {
            logg(wygrales);
        } else {
            if (input > number) {
                logg(zaDuza);
            } else {
                logg(zaMala);
            }
        }

        scanner.close();
    }

    public static void guessNumberProper() {
        Scanner scanner = new Scanner(System.in);
        if (random == null) {
            random = new Random();
        }

        // int number = random.nextInt(100) + 1;
        int number = 50;

        System.out.println("Mysle o liczbie pomiedzy 1 a 100 (z nimi wlacznie).");
        System.out.println("Czy zgadniejsz jaka to liczba?");

        int wrong = 0;
        // boolean didBreak = false;
        while (wrong < 3) {
            Integer input = null;
            System.out.print("Podaj liczbe: ");
            input = scanner.nextInt();

            if (number > input) {
                System.out.println("Podana liczba jest za mala.");
            } else if (number < input) {
                System.out.println("Podana liczba jest za duza.");
            } else {
                System.out.println("Gratulacje, zgadles!");
                // didBreak = true;
                break;
            }
            wrong++;
        }
        // if (!didBreak) {
        // System.out.println("Przykro mi ale przegrales :(");
        // }
        if (wrong >= 3) {
            System.out.println("Przykro mi ale przegrales :(");
        }
        scanner.close();
    }

    // problem kinda starts here
    // int wrong = 0;
    // if (wrong <= 3) {
    // Integer input = null;
    // input = scanner.nextInt();

    // if (number > input) {
    // System.out.println("Podana liczba jest za mała.");
    // wrong++;
    // System.out.print("Podaj kolejną liczbę: ");
    // input = scanner.nextInt();
    // } else if (number < input) {
    // System.out.println("Podana liczba jest za duża.");
    // wrong++;
    // System.out.print("Podaj kolejną liczbę: ");
    // input = scanner.nextInt();
    // } else {
    // System.out.println("Gratulacje, zgadłeś!");
    // }
    // } else {
    // System.out.println("Przykro mi ale przegrałeś :(");
    // }
    // and ends here

    private static final void logg(Object o) {
        System.out.println(o);
    }

    private static final void log(Object o) {
        System.out.print(o);
    }
}
