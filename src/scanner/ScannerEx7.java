package scanner;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt(); // 10\n -> 10만 읽어버림 \n은 입력으로 남아있음
            sc.nextLine(); // \n을 입력으로 받아버려서 \n 지워줌

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
