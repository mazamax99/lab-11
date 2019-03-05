package p1;
class Protection1 {
    public static int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection1() {
        System.out.println("Кoнcтpyктop базового класса");
        System.out.println("n =" + n);
        System.out.println("n_pri " + n_pri);
        System.out.println("n_pro " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
class Derived1 extends p1.Protection1 {
    Derived1() {
        System.out.println("Кoнcтpyктop подкласса");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
class SamePackages1 {
    SamePackages1() {
        Protection1 p = new Protection1();
        System.out.println("Кoнcтpyктop подкласса");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}
public class DemoBat {
    public static void main(String args[]) {
        Protection1 оb1 = new Protection1();
        Derived1 оb2 = new Derived1();
        SamePackages1 оbЗ = new SamePackages1();
    }
}
