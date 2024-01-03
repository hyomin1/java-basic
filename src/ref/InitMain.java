package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); //초기화 하지 않아서 0으로 자동 초기화
        System.out.println("value2 = " + data.value2);
    }
}
