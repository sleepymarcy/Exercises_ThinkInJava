public class Doubloon {
    public static void main(String[] args) {
        isDoubloon("habahabadupasiusiaksiusiakdupamamatata");
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
