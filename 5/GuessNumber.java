import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        // they both a' kilogram
        int number = random.nextInt(100) + 1;

        log("Myślę o liczbie pomiędzy 1 a 100 (z nimi włącznie).");
        log("Czy zgadniejsz jaka to liczba?");
        log("Podaj liczbę: ");

        // try {
        // Integer input = scanner.nextInt();
        // } catch (Exception e) {
        // System.out.println(e);
        // System.out.println("Proszę podać cyfrę.");
        // }

        Integer input = scanner.nextInt();
        if (input == number) {
            log("Gratulacje, wygrałeś!");
        } else if (input > number) {
            log("Liczba jest za duża.");
        } else {
            log("Liczba jest za mała.");
        }

        input = scanner.nextInt();
        if (input == number) {
            log("Gratulacje, wygrałeś!");
        } else {
            if (input > number) {
                log("Liczba jest za duża.");
            } else {
                log("Liczba jest za mała.");
            }
        }

        input = scanner.nextInt();
        if (input == number) {
            log("Gratulacje, wygrałeś!");
        } else {
            if (input > number) {
                log("Liczba jest za duża.");
            } else {
                log("Liczba jest za mała.");
            }
        }
    }

    private final static void log(Object o) {
        System.out.println(o);
    }
}