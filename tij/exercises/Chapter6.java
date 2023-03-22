package tij.exercises;

import java.util.Scanner;

public class Chapter6 {
    Chapter6(){}

    public static void squarerootMain() {
        try (Scanner scanner = new Scanner(System.in)) {
            String buffer = scanner.nextLine().strip();

            while (buffer.length() > 0) {
                try {
                    System.out.println(squareRoot(Double.parseDouble(buffer)));
                } catch (Exception e) {
                    break;
                }
                buffer = scanner.nextLine().strip();
            }
        }
    }

    public static double squareRoot(double a) {
        double przyblPierw = a / 2;
        // double nowePrzybl = popraw(przyblPierw, a);
        double nowePrzybl = (przyblPierw + a / przyblPierw) / 2;

        while (Math.abs(przyblPierw - nowePrzybl) > 0.0001) {
            przyblPierw = nowePrzybl;
            // nowePrzybl = popraw(przyblPierw, a);
            nowePrzybl = (przyblPierw + a / przyblPierw) / 2;
        }

        return nowePrzybl;
    }

    public static double popraw(double przyblPierw, double dana) {
        return (przyblPierw + dana / przyblPierw) / 2;
    }

    public static void loop(Integer n) {
        Integer i = n;
        while (i > 1) {
            // System.out.println(i + ", " + n);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                System.out.println(i + ", " + n);
                i = i + 1;
            }
        }
    }

    public static void greekAlphabet() {
        // before running this code insert chcp 65001 into the terminal

        System.out.print("Alfabet grecki: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        // String name = "Ezreal";
        String name2 = "" + (char) (913 + 4) + (char) (913 + 5) + "real";
        System.out.println(name2.substring(0, 2) + " oh, you're dead.");
        char character = (char) (918);
        System.out.println(name2.indexOf(character));

    }

    public static void gaussMain() {
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

    public static void isDoubloon(String str) {
        if (isOdd(str.length())) {
            str = null;
        } else
            while (str.length() > 0) {
                char let = str.charAt(0);
                String substr = str.substring(1);
                str = divideString(let, substr);
                if (str == null)
                    break;
            }

        if (str == null) {
            System.out.println("nie");
        } else {
            System.out.println("tak");
        }

        System.out.print(str);
    }

    private static String divideString(char letter, String word) {
        int index = word.indexOf(letter);
        if (index >= 0) {
            String ss1 = word.substring(0, index);
            String ss2 = word.substring(index + 1);
            return ss1 + ss2;
        } else {
            return null;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return !isEven(number);
    }
}
