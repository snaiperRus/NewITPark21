package lesson4;

public class TernarnOperatorRunner {
    public static void main(String[] args) {
        System.out.println(abs(25));
        System.out.println(abs(-13));
    }

    public static int abs(int value) {
//        if (value >= 0) {
//            return value;
//        } else {
//            return -value;
//        }
//    }
        return value >= 0 ? value : -value; // в result окажется значение value если оно больше или равно нулю или (минус) -value если оно меньше нуля
    }
}
