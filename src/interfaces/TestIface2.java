package interfaces;

class TestIface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient оb = new AnotherClient();

        c.callback(4);

        c = оb; // теперь переменная с ссылается на
        // объект типа AnotherClient
        c.callback(4);
    }
}