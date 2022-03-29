package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetofore("жёлтый"));
        System.out.println(getSolutionOfSphetofore("зелёный"));
        System.out.println(getSolutionOfSphetofore("красный"));
    }

    public static String getSolutionOfSphetofore(String color) {
        String result;

        switch (color) {
            case "красный": {
                result = "Проход запрещён";
                break;
            }
            case "жёлтый": {
                result = "Будь внимательным";
                break;
            }
            case "зелёный": {
                result = "Проход разрешён";
                break;
            }
            default: {
                result = "";
                break;
            }
        }
        {
            return result;
        }
    }
}
