package lesson4;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������������:");
        String userName = scanner.nextLine();
        System.out.println("����� ����������, " + userName + " , ������� ����� ��� �������: ");
        int value = scanner.nextInt();
        System.out.println("������������, ��� �� ����� " + value);
    }
}
