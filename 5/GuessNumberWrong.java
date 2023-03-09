import java.util.Random;
import java.util.Scanner;

public class GuessNumberWrong {

    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();
    
    public static void main(String[] args) {
        // they both a' kilogram
        int number = random.nextInt(100) + 1;

        System.out.println("Myślę o liczbie pomiędzy 1 a 100 (z nimi włącznie).");
        System.out.println("Czy zgadniejsz jaka to liczba?");
        System.out.print("Podaj liczbę: ");

        int wrong = 0;

        if (wrong <= 3) {
            Integer input = null;
            input = scanner.nextInt();

            if (number > input) {
                System.out.println("Podana liczba jest za mała.");
                wrong++;
                System.out.print("Podaj kolejną liczbę: ");
                input = scanner.nextInt();
            } else if (number < input) {
                System.out.println("Podana liczba jest za duża.");
                wrong++;
                System.out.print("Podaj kolejną liczbę: ");
                input = scanner.nextInt();
            } else {
                System.out.println("Gratulacje, zgadłeś!");
            }
        } else {
            System.out.println("Przykro mi ale przegrałeś :(");
        }
    }
}
