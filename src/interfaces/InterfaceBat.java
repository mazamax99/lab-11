package interfaces;

interface Callback1 {
    void callback1(int param);
}
class Client1 implements Callback1 {
    // реализовать интерфейс Callback
    public void callback1(int р) {
        System.out.println("Метод callback(), вызываемый со значением " + р);
    }

    void nonIfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы, " +
                "могут определяться и другие члены.");
    }
}
class AnotherClient1 implements Callback1 {
    // реализовать интерфейс CallЬack
    public void callback1(int р) {
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("p в квадрате равно " + (р*р));
    }
}
public class InterfaceBat {
    public static void main(String args[]) {
        Callback1 c = new Client1();
        AnotherClient1 оb = new AnotherClient1();

        c.callback1(4);

        c = оb; // теперь переменная с ссылается на
        // объект типа AnotherClient
        c.callback1(4);
    }
}
