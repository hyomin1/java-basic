package static2;

public class DecoUtil2 {
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    } //정적 메서드, 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능
}
