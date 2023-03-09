public class Date {

    public static void usFormat(String day, int date, String month, int year) {
        System.out.println("Format amerykański:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void euFormat(String day, int date, String month, int year) {
        System.out.println("Format europejski:");
        System.out.print(day + ", " + date + " " + month + ", " + year);
    }

    public static void main(String[] args) {

        String day = "środa";
        int date = 22;
        String month = "luty";
        int year = 2023;

        usFormat(day, date, month, year);
        euFormat(day, date, month, year);
    }
}