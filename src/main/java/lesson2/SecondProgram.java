package lesson2;

public class SecondProgram {

    int arg1, arg2;

    public static void main(String[] args) {
        System.out.println("Hello, world!123");
        long summa = summa(3, 5);
        System.out.println(summa);
        long othersumma = summa(5, 5);
        System.out.println(othersumma);
        long yetsumma = summa(2, 18);
        System.out.println(yetsumma);

        long minussumma = minus(2, 18);
        System.out.println(minussumma);
        long result = multiplyAndSumma(5);
        System.out.println(result);
    }
    public static long summa(int arg1, int arg2){
        int result = arg1 + arg2;
        return result;
    }
    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
    public static long multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 15;
        result = result - 38;
        return result;
    }
}