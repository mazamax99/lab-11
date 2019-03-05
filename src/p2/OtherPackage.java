package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection р = new p1.Protection();
        System.out.println("Кoнcтpyктop иэ другого пакета");
        System.out.println("n_ pub = " + р.n_pub);
    }
}