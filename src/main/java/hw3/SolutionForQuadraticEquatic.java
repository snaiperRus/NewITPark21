package hw3;

public class SolutionForQuadraticEquatic {
    public static void main(String[] args) {
//      a * x^2 + b * x + c = 0
        int a = 1;
        int b = -4;
        int c = 4;
        extracted(a, b, c);
        extracted(1, 6, 9);
        extracted(1, 8, 7);
        extracted(1, 8, 72);

    }

    private static void extracted(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Нет Корней " + D);
        } else if (D == 0) {
            int x = -b / (2 * a);
            System.out.println("Один корень " + x);
        } else {
            int x1 = (int) (-b + Math.sqrt(D)) / (2 * a);
            int x2 = (int) (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Два корняx " + x1 + " " + x2);
        }
    }
}

