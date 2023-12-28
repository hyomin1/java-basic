package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; //a값 증가시키고 그 결과를 b에 대입
        System.out.println("a = "+ a + " b = "+ b);

        a = 1;
        b = 0;
        b = a++; //a값을 b에 대입하고 그 후 a 값 증가
        System.out.println("a = " + a + " b = "+ b);



    }

}
