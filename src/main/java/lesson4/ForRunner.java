package lesson4;

public class ForRunner {
    public static void main(String[] args) {
        int globacCounter;
        for (int counter = globacCounter = 1, value = 1; counter <= 30; counter++, value++) {
            if (counter % 2 == 0) {     // ������������ ������ ������ �����
                System.out.println("������� �������� ��������: " + counter + " " + value);
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