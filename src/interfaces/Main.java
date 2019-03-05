package interfaces;

public class Main {

    public static void main(String[] args) {

    }
}

// Пример вложенного интерфейса
// Этот класс содержит интерфейс как свой член
class First {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int х);
    }
}
// Класс В реализует вложенный интерфейс
class Second implements First.NestedIF {
    public boolean isNotNegative(int х) {
        return х < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String args[]) {

        // использовать ссылку на вложенный интерфейс
        First.NestedIF nif = new Second();

        if (nif.isNotNegative(10))
            System.out.println("Чиcлo 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}