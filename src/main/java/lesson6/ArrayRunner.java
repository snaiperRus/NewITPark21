package lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {
    public static void main(String[] args) {
        char[] symbols = new char[10];
//        symbols[0] = '\u0000';  // ��� ������� ����
        printArray(symbols);
        fillArray(symbols);
        System.out.println("-----------");
        printArray(symbols);
        System.out.println("-----------");
        System.out.println(indexOf(symbols, '�'));
        System.out.println("-----------");
        System.out.println(indexOf(symbols, '�'));
        System.out.println("-----------");
        System.out.println(String.valueOf(symbols));
        int[] intArray = new int[100];  //0
        boolean[] booleans = new boolean[5];    //false
        String[] str = new String[3];   //null
        double[] doubleArray = new double[]{0.1, 25.1, 78};
        System.out.println(Arrays.toString(doubleArray));
        String[] strings = {"������", "���"};
        System.out.println(Arrays.toString(strings));
    }

    public static void printArray(char[] symbols) {
//        for (int i = 0; i < symbols.length; i++) {
//        System.out.println(symbols[i]);
        for (char symbol : symbols) {
            System.out.println(symbol);
        }

    }

    public static void fillArray(char[] symbols) {
        symbols[0] = '�';
        symbols[1] = '�';
        symbols[2] = '�';
        symbols[3] = '�';
        symbols[4] = '�';
        symbols[5] = '�';
        symbols[6] = '�';
        symbols[7] = '�';
        symbols[8] = '�';
        symbols[9] = '�';

    }

    public static int indexOf(char[] symbols, char searchElement) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static String[] weekDays() {
//        Math.random(); // [0, 1]
        Random random = new Random();

        return random.nextBoolean() ? new String[]{"Mon", "Tue"} : null;
    }
}