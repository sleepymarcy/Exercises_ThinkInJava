// before running this code insert chcp 65001 into the terminal

public class GreekAlphabet {
    public static void main(String[] args) {
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
}
