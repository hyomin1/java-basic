package loop;

public class LoopEx2_2 {
    public static void main(String[] args) {
//        int num = 2;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num);
//            num += 2;
//        }
        for (int num = 2, count = 1; count <= 10; count++, num +=2) {
            System.out.println(num);
        }
    }
}
