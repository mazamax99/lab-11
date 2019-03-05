package p1;

public class SamePackages {
    SamePackages() {
        Protection p = new Protection();
        System.out.println("Кoнcтpyктop подкласса");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}
