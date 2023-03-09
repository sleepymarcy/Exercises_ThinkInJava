import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String buffer = scanner.nextLine().strip();

            while(buffer.length()>0) {            
                try{
                System.out.println(squareRoot(Double.parseDouble(buffer)));
                } catch (Exception e) {
                    break;
                }
                buffer = scanner.nextLine().strip();
            }
        }
    }

    public static double squareRoot(double a) {
        double przyblPierw = a/2;
        // double nowePrzybl = popraw(przyblPierw, a);
        double nowePrzybl = (przyblPierw + a/przyblPierw)/2;

        while(Math.abs(przyblPierw - nowePrzybl) > 0.0001){
            przyblPierw = nowePrzybl;
            // nowePrzybl = popraw(przyblPierw, a);
            nowePrzybl = (przyblPierw + a/przyblPierw)/2;
        }

        return nowePrzybl;
    }

    public static double popraw(double przyblPierw, double dana) {
        return (przyblPierw + dana/przyblPierw)/2;
    }
}
