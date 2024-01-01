package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n = sc.nextInt();
        int []numbers = new int[n];
        int sum = 0;


        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("입력한 정수의 평균: " + average);


    }
}
