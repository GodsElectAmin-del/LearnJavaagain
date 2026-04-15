package InnerClassesExample;

public class Main {
    public static void main(String[] args) {
        Inner io = new Inner();
        Inner.Inside oi = io.new Inside();
        String first = io.o;
        String second = oi.i;
        System.out.println("The Outside Word is: " + first + "; The Inside Word is: " + second);
    }

}

// Had to look at the 5 minute tutorial while making this code
