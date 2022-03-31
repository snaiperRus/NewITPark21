package hw5;

import java.util.Scanner;

public class findFibanachi {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Вы ввели " + a);
        int a1 = 0;
        int a2 = 1;
        for (int i = 2; i <= a; i++) {
            int a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        System.out.println("Число Фибаначчи " + a2);
    }
}