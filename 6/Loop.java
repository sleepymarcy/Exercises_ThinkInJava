public class Loop {
    public static void main(String[] args) {
        loop(65537);
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
}
