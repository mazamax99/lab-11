package interfaces;

class AnotherClient implements Callback {
    // реализовать интерфейс CallЬack
    public void callback(int р) {
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("p в квадрате равно " + (р*р));
    }
}