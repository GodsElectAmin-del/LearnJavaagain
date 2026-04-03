package PUE_1;

public class xHochn {
    public static void main(String[] args) {
        int n = 5;
        int counter1 = 0;
        int counter2 = 0;
        int result = 1;
        // int resultLoop2;
        int x = 6;
        int xFixed;
        result = x;
        xFixed = x;

        while (counter1 <= n - 1) {
            result = x;
            counter1 = counter1 + 1;
            System.out.println("Current result: " + result + " Current Counter1: " + counter1);
            x = 0;
            counter2 = 0;
            while (counter2 <= xFixed - 1) {
                x = x + result;
                counter2 = counter2 + 1;
                System.out.println("Current x: " + x + " Current Counter2: " + counter2);
            }
        }

        System.out.println("Das ist der finale wert " + result);

    }

}
