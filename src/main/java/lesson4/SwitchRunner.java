package lesson4;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(getSolutionOfSphetofore("�����"));
        System.out.println(getSolutionOfSphetofore("������"));
        System.out.println(getSolutionOfSphetofore("�������"));
    }

    public static String getSolutionOfSphetofore(String color) {
        String result;

        switch (color) {
            case "�������": {
                result = "������ ��������";
                break;
            }
            case "�����": {
                result = "���� ������������";
                break;
            }
            case "������": {
                result = "������ ��������";
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
