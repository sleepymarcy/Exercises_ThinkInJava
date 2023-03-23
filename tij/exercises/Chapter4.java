package tij.exercises;

public class Chapter4 {
    Chapter4(){}

    public static double ex1(int x){
        return (x*71)/2.0;
    }

    public static void multAddTests() {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4)));
        multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4));
        System.out.println(multadd(2, Math.log(10), Math.log(2)));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void usFormat(String day, int date, String month, int year) {
        System.out.println("Format amerykański:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void euFormat(String day, int date, String month, int year) {
        System.out.println("Format europejski:");
        System.out.print(day + ", " + date + " " + month + ", " + year);
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + "zup");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("bu-ua-ha-ha");
        }
    }

}
