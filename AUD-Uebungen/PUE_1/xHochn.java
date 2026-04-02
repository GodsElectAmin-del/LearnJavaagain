package PUE_1;

public class xHochn {
    public static void main(String[] args) {
        int result;
        int xi = 3;
        int xj;
        int PlatztHalter;

        xj = xi;
        PlatztHalter = xi;
        int n = 4;
        while (n >= 1) {
            result = xi;
            n--;
            xj = PlatztHalter;
            while (xj >= 1) {
                xi = result + result;
                xj--;
            }
        }

        System.out.println("Das ist der finale wert " + xi);

    }

}
