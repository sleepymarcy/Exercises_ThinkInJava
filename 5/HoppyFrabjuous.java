public class HoppyFrabjuous {
    public static void main(String[] args) {
        boolean flag1 = isHoppy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);

        if (flag1 && flag2) {
            System.out.println("ping!");
        }
        if (flag1 || flag2) {
            System.out.println("pong!");
        }
    }

    public static boolean isHoppy(int x) {
        boolean hoppyFlag;
        if (x % 2 == 0) {
            hoppyFlag = true;
        } else {
            hoppyFlag = false;
        }
        return hoppyFlag;
    }

    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}
