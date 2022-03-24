package lesson3;

public class StandartPrimitives {

    public static void main(String[] args) {
        byte argument = 123; // 2^7
        byte errorDigit = (byte) 130;
        byte digit = (byte) (28 + 100);
        System.out.println(digit + errorDigit);

        short anotherDigit = 768; // 2^15
        int arg = Integer.MAX_VALUE; // 2^31
        System.out.println(arg);
        long bigValue = 21474836478L; // 2^63

        char symbol = 'Я'; // 2^16
        System.out.println(symbol + 1);

        double digitWithPoint = 3.14;
        float floatValue = 100.25F;

        boolean flag = true;
        boolean lie = false;
        boolean value = 100 != 1_000_000;
        boolean notValue = !value;
        boolean trueValue = true != false; //не использовать
        boolean complexAnd = (100 == 100) && (125 == 125);
        boolean complexOr = (100 == 100) || (125 == 125);

        if (value) {
            System.out.println("Переменная value истина");
        } else {
            System.out.println("Переменная value ложна");
        }

        double floatingPointValue = 1.5;
        if (2.5 == floatingPointValue) {
            System.out.println("2.5 равно " + floatingPointValue);
        } else if (1 == 1) {
            System.out.println("2.5 не равно " + floatingPointValue + " но 1 равно 1");
        } else {
            System.out.println("2.5 не равно " + floatingPointValue);
        }

        boolean bool1 = floatingPointValue != 0 && (100 / floatingPointValue == 10);

        if (!bool1) {

        } else {


        }
    }
}
