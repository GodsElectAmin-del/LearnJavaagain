package SuperKeyword;

public class Spiderman extends Person {
    String Name = "Spiderman";
    double Strenght = 100000000.0;

    public void HowOp() {
        super.HowOp();
        System.out.println("But he is also " + Name + " His real strenght is" + Strenght * 100 + " %");
    }
}
