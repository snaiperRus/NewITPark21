package hw4;

public class sqrt {
    public static void main(String[] args) {
        System.out.print(findSqrt(25));
    }

    public static int findSqrt(int a) {
        if (a < 2) return a;
        int i=1;
        while (i*i<=a){
            if(i*i<=0) break;
            i++;
        }
        return --i;
    }
}
