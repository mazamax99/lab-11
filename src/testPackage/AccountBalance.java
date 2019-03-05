package testPackage;
class Balanced {
    String name;
    double bal;

    public Balanced(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print(" --> ");
        System.out.println(name + ": $" + bal);
    }
}
public class AccountBalance {
    public static void main(String args[]) {
        Balanced current[] = new Balanced[3];
        current[0] = new Balanced(" K. J. Fielding", 123.23);
        current[1] = new Balanced("Will Tell", 157.02);
        current[2] = new Balanced("Tom Jackson", -12.33);
        for (int i = 0; i < 3; i++) current[i].show();
    }
}
