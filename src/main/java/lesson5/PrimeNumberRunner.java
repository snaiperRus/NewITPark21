package lesson5;

import java.util.Scanner;

public class PrimeNumberRunner {
    public static void main(String[] args) {
        System.out.println("���������� ������� �����, ��� ������� ������� ��� ������� ������� ����� ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int limit = scanner.nextInt();
        printPrimeNumbers(limit);
    }

    public static void printPrimeNumbers(int threshold) {
        if (threshold <= 2) {
            System.out.println("��������� ���� ����� ������ 1 ");
        }
        for (int i = 1; i < threshold; i++) {
            if (isPrime(i)) {
                System.out.println("������� �������� " + i + " �������� �������");
            }
        }
    }

    public static boolean isPrime(int value) {
        boolean isPrime = false;    // ��� ������� �������
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            } else {            // ��� ������� �������
                isPrime = true; // ��� ������� �������
            }                   // ��� ������� �������
        }                       // ��� ������� �������
        return isPrime;        // ��� �������� isPrime �� true
    }

    public static int div(int arg1, int arg2) {
        if (arg2 == 0) {
            return -1;
        }
        return arg1 / arg2 ;
    }
}
