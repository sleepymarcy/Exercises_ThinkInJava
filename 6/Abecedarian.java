import java.util.Scanner;

public class Abecedarian {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a word: ");
            String input = scanner.nextLine();
            System.out.println("Is this an bbecadrian word? " + isAbecedarian(input));
        }
    }

    public static boolean isAbecedarian(String word) {
        int index = word.length() - 1;
        for (int i = 0; i < index; i++) {
            if (word.charAt(i) <= word.charAt(i + 1)) {
            } else {
                return false;
            }
        }
        return true;
    }

    // public static void alphabet() {
    // for (char c = 'A'; c <= 'Z'; c++) {
    // System.out.print(c);
    // }
    // }
}
