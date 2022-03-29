package hw4;

public class sqrt {
    public static void main(String[] args) {
        System.out.print(findSqrt(25));
    }

    public static int findSqrt(int a) {
        int i;
        for (i = 1; i <= a; i++)
            if (i * i == a) {
                break;
            }
        {
            return i;
        }
    }
}

//        int i = 1;
//        while (i * i <= a) {
//            if (i * i == a)
//                break;
//            i++;
//        }
//        return i;
//    }
//}