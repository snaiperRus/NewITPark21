package hw3;

public class NumberN {

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Факториал числа " + n + " равен " + factorial(n));
        System.out.println("Факториал числа " + n + " равен " + factorialByRecursion(n));
    }

    public static long factorial(int n) {
        long result = 1;
        if (n < 0) {
            return -1;
        } else if (n != 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static long factorialByRecursion(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return n * factorialByRecursion(n-1);
        }
    }
}