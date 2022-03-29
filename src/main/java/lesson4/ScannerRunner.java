package lesson4;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представтесь:");
        String userName = scanner.nextLine();
        System.out.println("Добро пожаловать, " + userName + " , введите число для расчёта: ");
        int value = scanner.nextInt();
        System.out.println("Подтверждаем, что Вы ввели " + value);
    }
}
