package lesson5;

import java.util.Scanner;

public class AdvancedScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("��������� ����� ��������, � �� ����� ������������ " + text);
        }
        int index = scanner.nextInt();
        System.out.println("�������-�� ������� ����� �������� " + index);
    }
}
