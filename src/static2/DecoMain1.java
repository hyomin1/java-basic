package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        //멤버 변수(인스턴스 변수)도 없고 단순히 기능만 제공함

        System.out.println("before: " + s);
        System.out.println("after: " + deco);


    }
}
