package lesson4;

public class ForRunner {
    public static void main(String[] args) {
        int globacCounter;
        for (int counter = globacCounter = 1, value = 1; counter <= 30; counter++, value++) {
            if (counter % 2 == 0) {     // обрабатывать только чётные числа
                System.out.println("Текущее значение счётчика: " + counter + " " + value);
                if (counter > 10) {
                    break;
                }
            }
        }
        System.out.println("------");
        for (; ; ) {
            System.out.println(globacCounter++);
            if (globacCounter > 5) {
                break;
            }
        }
    }
}