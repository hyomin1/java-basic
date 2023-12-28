package cond;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 2;

        String number = x % 2 == 0 ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + number);
    }
}
