package p1;

class Derived extends p1.Protection {
    Derived() {
        System.out.println("Кoнcтpyктop подкласса");
        System.out.println("n = " + n);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
