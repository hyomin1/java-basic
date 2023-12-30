package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;
        // do-while문 최초 한번은 코드 블럭을 실행 하는 경우
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
