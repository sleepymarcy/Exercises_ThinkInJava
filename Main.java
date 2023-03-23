import tij.exercises.*;

public class Main {
    public static void main(String[] args) {

        int[] counts = Chapter7.letterHist("Pizda");

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) i + " - " + counts[i]);
            }
        }
    }
}
