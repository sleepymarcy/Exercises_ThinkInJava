import java.util.Scanner;

public class Gauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine().strip();

        while (buffer.length() > 0) {
            try {
                String[] things = buffer.split(" ");
                System.out.println(
                        gauss(
                                Double.parseDouble(things[0]),
                                Integer.parseInt(things[1])));
            } catch (Exception e) {
                break;
            }
            buffer = scanner.nextLine().strip();
        }

        scanner.close();
    }

    public static double gauss(double x, int n) {
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += element(x, i);
        }
        return sum;
    }

    public static double element(double x, int n) {
        return customPow(-1, n) * customPow(x, 2 * n) / customFact(n);
    }

    public static double customPow(double podstawa, int wykladnik) {
        double power = 1;

        for (int numberObrotu = 0; numberObrotu < wykladnik; numberObrotu++)
            power *= podstawa;

        return power;
    }

    public static double customFact(int number) {
        double factorial = 1;

        // for (int numberObrotu = 0; numberObrotu < number; numberObrotu++)
        // factorial *= numberObrotu + 1;
        // for (int numberObrotu = 0 + 1; numberObrotu < number + 1; numberObrotu++)
        // factorial *= numberObrotu;
        for (int numberObrotu = 1; numberObrotu < number + 1; numberObrotu++)
            factorial *= numberObrotu;
        // for (int numberObrotu = 1; numberObrotu <= number; numberObrotu++)
        // factorial *= numberObrotu;

        return factorial;
    }
}
