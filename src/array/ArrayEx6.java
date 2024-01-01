package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = sc.nextInt();
        int []numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0 ; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0] , max = numbers[0];

        for (int number : numbers) {
            if (min > number)
                min = number;
            if (max < number)
                max = number;

        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
