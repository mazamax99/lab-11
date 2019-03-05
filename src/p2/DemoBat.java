package p2;
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
class Protection21 extends Protection1 {
    Protection21 () {
        System.out.println("конструктор , унаследованный из другого пакета") ;
        System.out.println( "n_pro = " + n_pro);
        System.out.println( "n_pub = "+ n_pub);
    }
}
class OtherPackage1 {
    OtherPackage1() {
        Protection1 р = new Protection1();
        System.out.println("Кoнcтpyктop иэ другого пакета");
        System.out.println("n_ pub = " + р.n_pub);
    }
}
public class DemoBat {
    public static void main(String args[]) {
        Protection21 оb1 = new Protection21();
        OtherPackage1 оb2 = new OtherPackage1();
    }
}
