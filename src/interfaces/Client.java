package interfaces;

class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int р) {
        System.out.println("Метод callback(), вызываемый со значением " + р);
    }

    void nonIfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы, " +
                "могут определяться и другие члены.");
    }
}