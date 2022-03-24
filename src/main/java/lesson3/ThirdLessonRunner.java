package lesson3;

public class ThirdLessonRunner {
    public static void main(String[] args) {
        long summa = sum(35, 7);
        System.out.println("Сумма чисел 35 и 7 = " + summa);

        long substraction = minus(35, 7);
        System.out.println("Разность чисел 35 и 7 = " + substraction);

        long multi = miltiplication(35, 7);
        System.out.println("Умножение чисел 35 и 7 = " + multi);

        int operand = 36;
        double div = devision(operand, 7);
        System.out.println("Деление чисел " + operand + " и 7 = " + div);

        double modis = mod(16, 3);
        System.out.println("Остаток от деления " + modis);

        double result = pow(2, 4);
        System.out.println("Возведение числа 2 в степень 4 = Э" + result);
    }

    private static long mod(int i, int i1) {
        return i % i1;

    }

    private static long pow(int i, int i1) {
        return (long) Math.pow(i, i1);
    }

    public static long sum(int i, int i1) {

        return i + i1;
    }

    public static long minus(int i, int i1) {

        return i - i1;
    }

    public static long miltiplication(int i, int i1) {

        return i * i1;
    }

    public static double devision(double i, int i1) {

        return i / i1;
    }
}

